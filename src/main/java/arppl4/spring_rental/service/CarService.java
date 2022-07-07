package arppl4.spring_rental.service;

import arppl4.spring_rental.model.Car;
import arppl4.spring_rental.repository.RentalRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarService {
    private final RentalRepository rentalRepository;

    public List<Car> carList() {
        return rentalRepository.findAll();
    }

    public void addCar(Car car) {
        rentalRepository.save(car);
    }
}