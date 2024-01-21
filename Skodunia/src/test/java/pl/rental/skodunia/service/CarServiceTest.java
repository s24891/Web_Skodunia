package pl.rental.skodunia.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.rental.skodunia.car.CarRepository;
import pl.rental.skodunia.car.CarService;
import pl.rental.skodunia.car.model.Car;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CarServiceTest {

    @Mock
    private CarRepository carRepository;

    @InjectMocks
    private CarService carService;

    @Test
    void shouldFindCarById() {
        long carId = 1;

        Car carFromRepo = Car.builder()
                .make("Audi")
                .model("RS6 C8 Performance")
                .description("""
                        The Audi RS6 C8 Performance is the epitome of power blended with luxury.
                        Under its hood lies a 4.0-liter TFSI twin-turbocharged V8 engine, delivering a mighty 591 horsepower, paired with Audi's quattro all-wheel-drive system for unyielding grip. 
                        This avant-garde wagon's aggressive styling, with wide arches and a striking stance, is matched by a plush interior rich in technology and comfort. 
                        It's a versatile supercar disguised as a family-friendly estate, offering a thrilling yet practical ride for the discerning enthusiast.
                        """)
                .build();

        when(carRepository.findById(carId)).thenReturn(Optional.ofNullable(carFromRepo));
        Car carFound = carService.findById(carId);
        assertEquals(carFound, carFromRepo);
    }

    @Test
    void shouldFindAllCars() {
        Car carFromRepo = Car.builder()
                .make("BMW")
                .model("G82 M4 Competition")
                .description("""
                        The BMW M4 Competition (G82) exudes athleticism and prestige.
                        This high-performance machine boasts a 3.0-liter BMW M TwinPower Turbo inline 6-cylinder engine, churning out an impressive 503 horsepower.
                        With its sleek, muscular design, precision-tuned chassis, and driver-centric cockpit, the M4 Competition is engineered to dominate both road and track. 
                        Its responsive handling and blistering acceleration epitomize the M Division's motorsport DNA, making every drive an exhilarating experience.
                        """)
                .build();

        when(carRepository.findAll()).thenReturn(List.of(carFromRepo));
        List<Car> carsFound = carService.findAll();
        assertEquals(carsFound.get(0), carFromRepo);
    }

}
