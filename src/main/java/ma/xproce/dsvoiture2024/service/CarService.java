package ma.xproce.dsvoiture2024.service;

import ma.xproce.dsvoiture2024.dto.CarDTO;

import java.util.List;

public interface CarService {
    public CarDTO saveCar(CarDTO carDto);

    public List<CarDTO> getCarByModel(String model);

}