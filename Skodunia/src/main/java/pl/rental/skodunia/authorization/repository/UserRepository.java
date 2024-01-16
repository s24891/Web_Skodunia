package pl.rental.skodunia.authorization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rental.skodunia.authorization.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
