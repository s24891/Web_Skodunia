package pl.rental.skodunia.car;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rental.skodunia.car.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
