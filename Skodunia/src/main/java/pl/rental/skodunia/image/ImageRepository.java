package pl.rental.skodunia.image;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rental.skodunia.image.model.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}