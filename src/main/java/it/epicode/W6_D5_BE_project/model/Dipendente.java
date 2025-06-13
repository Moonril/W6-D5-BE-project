package it.epicode.W6_D5_BE_project.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Dipendente {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String cognome;
    private String username;
    private String email;

    @OneToOne
    @JoinColumn(name = "prenotazione_id")
    private Prenotazione prenotazione;

}
