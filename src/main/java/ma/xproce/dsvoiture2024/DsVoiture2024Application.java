package ma.xproce.dsvoiture2024;

import ma.xproce.dsvoiture2024.dto.CarDTO;
import ma.xproce.dsvoiture2024.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DsVoiture2024Application {

    public static void main(String[] args) {
        SpringApplication.run(DsVoiture2024Application.class, args);
    }

    @Bean
    CommandLineRunner start(CarService carService){
        return  args -> {
            carService.saveCar(CarDTO.builder().model("BMW").color("Black").matricul("ABC").price(150000).build());
            carService.saveCar(CarDTO.builder().model("Mercedes").color("Red").matricul("DEF").price(34000).build());
            carService.saveCar(CarDTO.builder().model("Audi").color("Yellow").matricul("JHG").price(485963).build());
            carService.saveCar(CarDTO.builder().model("Bently").color("White").matricul("IKL").price(123456).build());
        };
    }
}
