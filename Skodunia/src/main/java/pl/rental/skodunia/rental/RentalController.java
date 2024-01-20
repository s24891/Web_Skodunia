package pl.rental.skodunia.rental;

import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.rental.skodunia.authorization.UserService;
import pl.rental.skodunia.authorization.model.User;
import pl.rental.skodunia.car.CarRepository;
import pl.rental.skodunia.car.model.Car;
import pl.rental.skodunia.image.model.Image;
import pl.rental.skodunia.rental.model.Rental;

import java.security.Principal;
import java.time.LocalDate;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class RentalController {
    private final RentalService rentalService;
    private final UserService userService;
    private final CarRepository carRepository;

    @GetMapping("/rental/panel/{carId}")
    public String rental(Model model, @PathVariable Long carId) {
        Car car = carRepository.findById(carId)
                .orElseThrow();
        model.addAttribute("chosenCar", car);
        Long carImageId = Optional.ofNullable(car.getImages())
                .flatMap(images -> images.stream().findFirst())
                .map(Image::getId)
                .orElse(1L);

        model.addAttribute("carImageId", carImageId);

        return "rental/rental.html";
    }

    @PostMapping("/rental")
    public String createRental(
            @RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate,
            @RequestParam("carId") Long carId,
            Principal principal,
            RedirectAttributes redirectAttributes) {

        String email = principal.getName(); // Pobierz nazwę użytkownika (email) z Principal
        User user = userService.findByEmail(email); // Użyj metody serwisu, aby znaleźć użytkownika

        Car car = carRepository.findById(carId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Car not found"));

        rentalService.createRental(car, startDate, endDate, user); // przekaż znalezionego użytkownika

        redirectAttributes.addFlashAttribute("successMessage", "Samochód został zarezerwowany.");
        return "redirect:/rental/confirmation";
    }
}
