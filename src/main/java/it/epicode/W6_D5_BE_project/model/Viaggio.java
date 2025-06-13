package it.epicode.W6_D5_BE_project.model;

import it.epicode.W6_D5_BE_project.enums.StatoViaggio;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Viaggio {
    @Id
    @GeneratedValue
    private int id;
    private String destinazione;
    private LocalDate dataViaggio;
    @Enumerated(EnumType.STRING)
    private StatoViaggio statoViaggio;

    @OneToOne
    @JoinColumn(name = "prenotazione_id")
    private Prenotazione prenotazione;

}
