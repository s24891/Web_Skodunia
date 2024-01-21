package pl.rental.skodunia.authorization;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.rental.skodunia.authorization.model.User;
import pl.rental.skodunia.authorization.model.UserDto;
import pl.rental.skodunia.rental.RentalService;
import pl.rental.skodunia.rental.model.Rental;

import java.security.Principal;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class AuthController {

    private final RentalService rentalService;
    private final UserService userService;

    @GetMapping("/login")
    public String loginForm() {
        return "authorization/login";
    }

    // handler method to handle user registration request
    @GetMapping("register")
    public String showRegistrationForm(Model model) {
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "authorization/register";
    }

    // handler method to handle register user form submit request
    @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("user") UserDto user,
                               BindingResult result,
                               Model model) {
        User existing = userService.findByEmail(user.getEmail());
        if (existing != null) {
            result.rejectValue("email", null, "There is already an account registered with that email");
        }
        if (result.hasErrors()) {
            model.addAttribute("user", user);
            return "register";
        }
        userService.saveUser(user);
        return "redirect:/register?success";
    }

    @GetMapping("/users")
    public String listRegisteredUsers(Model model) {
        List<UserDto> users = userService.findAllUsers();
        model.addAttribute("users", users);
        return "authorization/users";
    }

    @GetMapping("/user/user-details")
    public String getUserDetails(
            Model model,
            Principal principal
    ) {
        String email = principal.getName();
        User user = userService.findByEmail(email);
        model.addAttribute("userDetail", user);

        List<Rental> foundRentals = rentalService.findAllRentalsByUser(user);
        model.addAttribute("rentals", foundRentals);
        System.out.println(foundRentals);

        return "user/user-details";
    }
}
