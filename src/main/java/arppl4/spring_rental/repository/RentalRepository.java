package arppl4.spring_rental.repository;

import arppl4.spring_rental.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends JpaRepository<Car, Long> {

}