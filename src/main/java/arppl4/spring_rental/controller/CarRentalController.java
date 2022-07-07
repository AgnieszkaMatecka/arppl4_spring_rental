package arppl4.spring_rental.controller;

import arppl4.spring_rental.service.CarRentalService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/carrental")
@RequiredArgsConstructor
public class CarRentalController {
    private final CarRentalService carRentalService;

}