package ma.xproce.dsvoiture2024.service;

import lombok.AllArgsConstructor;
import ma.xproce.dsvoiture2024.dao.entities.Car;
import ma.xproce.dsvoiture2024.dao.repositories.CarRepository;
import ma.xproce.dsvoiture2024.dto.CarDTO;
import ma.xproce.dsvoiture2024.mapper.CarMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CarManager implements CarService {

    private CarRepository carRepository;
    private CarMapper carMapper;

    @Override
    public CarDTO saveCar(CarDTO carDto) {
        Car car = carMapper.fromCarDtoToCar(carDto);
        car = carRepository.save(car);
        carDto = carMapper.fromCarToCarDto(car);
        return carDto;
    }

    @Override
    public List<CarDTO> getCarByModel(String model) {
        List<Car> cars = carRepository.findByModel(model);
        List<CarDTO> carDtos = new ArrayList<>();
        for (Car car : cars) {
            carDtos.add(carMapper.fromCarToCarDto(car));
        }
        return carDtos;
    }
}
