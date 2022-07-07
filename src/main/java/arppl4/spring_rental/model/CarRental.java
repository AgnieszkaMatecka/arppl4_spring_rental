package arppl4.spring_rental.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CarRental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imięINazwiskoKlienta;

    private LocalDateTime dataWynajmu;
    private LocalDateTime czasZwrotu;
    private Double canaNajmu;

    @ManyToOne
    @ToString.Exclude
    private Car car;

    public CarRental(String imięINazwiskoKlienta, LocalDateTime dataWynajmu, Double canaNajmu, Car car) {
        this.imięINazwiskoKlienta = imięINazwiskoKlienta;
        this.dataWynajmu = dataWynajmu;
        this.canaNajmu = canaNajmu;
        this.car = car;
    }
}
