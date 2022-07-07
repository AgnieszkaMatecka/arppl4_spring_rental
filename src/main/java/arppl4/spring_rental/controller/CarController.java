package arppl4.spring_rental.controller;

import arppl4.spring_rental.model.Car;
import arppl4.spring_rental.service.CarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/car")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping("/list")
    public List<Car> carList() {
        log.info("Wywołano listę samochodów");
        List<Car> allCars = carService.carList();
        return allCars;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addCar(@RequestBody Car car) {
        log.info("Dodano samochód: " + car);
        carService.addCar(car);
    }
    @PatchMapping("/update")
    public void updateCar(@RequestBody Car car) {
        log.info("Zaktualizowano dane samochodu: " + car);
        carService.updateCar(car);
    }

    @DeleteMapping("/delete/{identifier}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCar(@PathVariable(name = "identifier") Long id) {
        log.info("Usunięto samochód: " + id);
        carService.deleteCar(id);
    }
}