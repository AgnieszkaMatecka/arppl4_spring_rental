package arppl4.spring_rental.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nazwa;
    private String marka;
    private LocalDate dataProdukcji;

    @Enumerated(EnumType.STRING)
    private TypNadwozia typNadwozia;
    private Integer ilośćPasażerów;

    @Enumerated(EnumType.STRING)
    private TypSkrzyni typSkrzyni;

    private Double pojemnośćSilnika;
    public Car(String nazwa, String marka, LocalDate dataProdukcji, Integer ilośćPasażerów, Double pojemnośćSilnika, TypSkrzyni typSkrzyni) {
        this.nazwa = nazwa;
        this.marka = marka;
        this.dataProdukcji = dataProdukcji;
        this.typSkrzyni = typSkrzyni;
        this.ilośćPasażerów = ilośćPasażerów;
        this.pojemnośćSilnika = pojemnośćSilnika;
    }
}