package pl.rental.skodunia.car;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.rental.skodunia.car.model.Car;
import pl.rental.skodunia.image.model.Image;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;
    private final Random random;

    @GetMapping("/car/fleet")
    public String fleet(Model model) {
        List<Car> list = carService.findAll();
        model.addAttribute("availableCars", list);

        Map<Long, Long> randomImagesMap = list.stream()
                .collect(Collectors.toMap(
                        Car::getId,
                        car -> {
                            if (car.getImages() == null || car.getImages().isEmpty()) {
                                return 1L;
                            } else {
                                return car.getImages()
                                        .get(random.nextInt(car.getImages()
                                                .size()))
                                        .getId();
                            }
                        }
                ));

        model.addAttribute("randomImagesMap", randomImagesMap);
        return "car/fleet";
    }

    @GetMapping("/car/data/{id}")
    public String carDetails(Model model, @PathVariable Long id) {
        Car car = carService.findById(id);
        Long carImageId = Optional.ofNullable(car.getImages())
                .flatMap(images -> images.stream().findFirst())
                .map(Image::getId)
                .orElse(1L);

        model.addAttribute("carDetails", car);
        model.addAttribute("carImageId", carImageId);
        return "car/details-car";
    }

}
