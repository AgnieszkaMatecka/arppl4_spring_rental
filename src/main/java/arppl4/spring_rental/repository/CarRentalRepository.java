package arppl4.spring_rental.repository;

import arppl4.spring_rental.model.CarRental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRentalRepository extends JpaRepository<CarRental, Long> {
}
