package ma.xproce.dsvoiture2024.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Car {
    @Id
    @GeneratedValue
    Long id_Car;
    String model;
    String color;
    String matricul;
    double price;
}
