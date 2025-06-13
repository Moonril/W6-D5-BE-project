package it.epicode.W6_D5_BE_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Prenotazione {
    @Id
    @GeneratedValue
    private int id;
    private LocalDate dataRichiesta;
    private String preferenze;

    @OneToOne(mappedBy = "prenotazione")
    private Viaggio viaggio;

    @OneToOne(mappedBy = "prenotazione")
    private Dipendente dipendente;
}
