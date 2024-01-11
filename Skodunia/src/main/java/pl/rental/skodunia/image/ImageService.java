package pl.rental.skodunia.image;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import pl.rental.skodunia.image.model.Image;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ImageService {

    ImageRepository imageRepository;

    public Long uploadImage(Image image) {
        return imageRepository.save(image)
                .getId();
    }

    public byte[] findById(Long imageId) {
        return imageRepository.findById(imageId)
                .orElseThrow(() -> new IllegalArgumentException("Image with provided ID does not exists!"))
                .getContent();
    }
}
