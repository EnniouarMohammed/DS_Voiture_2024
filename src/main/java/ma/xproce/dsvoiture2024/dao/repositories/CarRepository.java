package ma.xproce.dsvoiture2024.dao.repositories;

import ma.xproce.dsvoiture2024.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    public List<Car> findByModel(String model);

}
