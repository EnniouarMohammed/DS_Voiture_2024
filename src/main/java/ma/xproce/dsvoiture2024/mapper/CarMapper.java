package ma.xproce.dsvoiture2024.mapper;

import ma.xproce.dsvoiture2024.dao.entities.Car;
import ma.xproce.dsvoiture2024.dto.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    private final ModelMapper mapper = new ModelMapper();
    public Car fromCarDtoToCar(CarDTO carDto){
        return mapper.map(carDto, Car.class);
    }

    public CarDTO fromCarToCarDto(Car car){
        return mapper.map(car, CarDTO.class);
    }
}