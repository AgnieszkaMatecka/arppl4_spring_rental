package arppl4.spring_rental.service;

import arppl4.spring_rental.repository.CarRentalRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarRentalService {
    private final CarRentalRepository carRentalRepository;

}