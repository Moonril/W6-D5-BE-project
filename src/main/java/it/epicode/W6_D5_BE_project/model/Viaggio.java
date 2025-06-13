package it.epicode.W6_D5_BE_project.model;

import it.epicode.W6_D5_BE_project.enums.StatoViaggio;
import jakarta.persistence.OneToOne;

import java.time.LocalDate;

public class Viaggio {
    private int id;
    private String destinazione;
    private LocalDate dataViaggio;
    private StatoViaggio statoViaggio;

    @OneToOne
    private
}
