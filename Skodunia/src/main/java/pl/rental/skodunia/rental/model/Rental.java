package pl.rental.skodunia.rental.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import pl.rental.skodunia.authorization.model.User;
import pl.rental.skodunia.car.model.Car;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name = "rentals")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalDateTime dateFrom;
    LocalDateTime dateTo;

    @ManyToOne
    @JoinColumn(name = "car_id")
    Car car;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

}
