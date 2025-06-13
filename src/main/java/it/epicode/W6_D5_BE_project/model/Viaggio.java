package it.epicode.W6_D5_BE_project.model;

import it.epicode.W6_D5_BE_project.enums.StatoViaggio;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Viaggio {
    private int id;
    private String destinazione;
    private LocalDate dataViaggio;
    private StatoViaggio statoViaggio;

    @OneToOne
    @JoinColumn(name = "prenotazione_id")
    private Prenotazione prenotazione;

}
