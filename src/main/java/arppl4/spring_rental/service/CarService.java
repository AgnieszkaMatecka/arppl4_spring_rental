package arppl4.spring_rental.service;

import arppl4.spring_rental.model.Car;
import arppl4.spring_rental.repository.RentalRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

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

    public void updateCar(Car daneAktualizujące) {
        Long id = daneAktualizujące.getId();
        Optional<Car> carOptional = rentalRepository.findById(id);
        if (carOptional.isPresent()) {
            Car editedCar = carOptional.get();

            if (daneAktualizujące.getNazwa() != null) {
                editedCar.setNazwa(daneAktualizujące.getNazwa());
            }
            if (daneAktualizujące.getTypSkrzyni() != null) {

                editedCar.setTypSkrzyni(daneAktualizujące.getTypSkrzyni());
            }
            if (daneAktualizujące.getPojemnośćSilnika() != null) {
                editedCar.setPojemnośćSilnika(daneAktualizujące.getPojemnośćSilnika());
            }

            if (daneAktualizujące.getDataProdukcji() != null) {
                editedCar.setDataProdukcji(daneAktualizujące.getDataProdukcji());
            }
            if (daneAktualizujące.getIlośćPasażerów() != null) {
                editedCar.setIlośćPasażerów(daneAktualizujące.getIlośćPasażerów());
            }

            rentalRepository.save(editedCar);
            log.info("Dane samochodu zostały zaktualizowane.");
            return;
        }
        throw new EntityNotFoundException("Nie znaleziono samochodu o id: " + daneAktualizujące.getId());
    }

    public void deleteCar(Long id) {
        rentalRepository.deleteById(id);
    }
}