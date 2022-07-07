package arppl4.spring_rental.controller;

import arppl4.spring_rental.model.Car;
import arppl4.spring_rental.service.RentalService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/rents")
@RequiredArgsConstructor
public class RentalController {
    private final RentalService rentalService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody Car car) {
        log.info("Wywołano dodanie samochodu: " + car);
        rentalService.addCar(car);
    }

}
