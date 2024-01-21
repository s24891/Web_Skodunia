package pl.rental.skodunia.rental;

import jakarta.persistence.EntityNotFoundException;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import pl.rental.skodunia.authorization.model.User;
import pl.rental.skodunia.car.CarRepository;
import pl.rental.skodunia.car.model.Car;
import pl.rental.skodunia.rental.model.Rental;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RentalService {
    RentalRepository rentalRepository;
    CarRepository carRepository;

    public List<Rental> findAllCarRentals(Long carId) {
        Car foundCar = carRepository.findById(carId)
                .orElseThrow(EntityNotFoundException::new);
        return rentalRepository.findAllByCar(foundCar);
    }

    public void createRental(Car car, LocalDate startDate, LocalDate endDate, User user) {
        rentalRepository.save(
                Rental.builder()
                        .dateFrom(startDate.atStartOfDay())
                        .dateTo(endDate.atStartOfDay())
                        .user(user)
                        .car(car)
                        .build()
        );
    }

    public List<Rental> findAllRentalsByUser(User user) {
        return rentalRepository.findAllByUser(user);
    }
}

