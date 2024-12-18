package ma.xproce.dsvoiture2024.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class CarDTO {
    String model;
    String color;
    String matricul;
    double price;

}