package pl.rental.skodunia.rental;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rental.skodunia.car.model.Car;
import pl.rental.skodunia.rental.model.Rental;

import java.util.List;

public interface RentalRepository extends JpaRepository<Rental, Long> {

    List<Rental> findAllByCar(Car car);
}
