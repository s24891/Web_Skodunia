package pl.rental.skodunia.authorization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rental.skodunia.authorization.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
