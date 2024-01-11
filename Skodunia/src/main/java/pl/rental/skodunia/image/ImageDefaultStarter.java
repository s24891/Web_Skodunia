package pl.rental.skodunia.image;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;
import pl.rental.skodunia.car.CarService;
import pl.rental.skodunia.image.model.Image;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

@Service
@Slf4j
@RequiredArgsConstructor
public class ImageDefaultStarter {

    private final ImageService imageService;
    private final CarService carService;
    private final ResourceLoader resourceLoader;
    private final Random random;
    private Integer totalAmountOfCars = 0;

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        preInit();
        log.info("Initializing loading of images for cars....");

        String pattern = "classpath:/templates/images/car_img/*.jpg";
        try {
            Resource[] resources = ResourcePatternUtils.getResourcePatternResolver(resourceLoader)
                    .getResources(pattern);
            for (Resource resource : resources) {
                if (resource.isReadable()) {
                    try (InputStream inputStream = resource.getInputStream()) {
                        byte[] content = StreamUtils.copyToByteArray(inputStream);
                        String filename = resource.getFilename();
                        Image image = Image.builder()
                                .name(filename)
                                .content(content)
                                .car(carService.findById(random.nextLong(totalAmountOfCars) + 1)) // +1 jeżeli zakładamy, że id zaczyna się od 1
                                .build();

                        imageService.uploadImage(image);
                    }
                }
            }
        } catch (IOException e) {
            log.error("Error reading images", e);
        }

        log.info("Finished initialization");
    }

    private void preInit() {
        totalAmountOfCars = carService.findAll().size();
    }

}
