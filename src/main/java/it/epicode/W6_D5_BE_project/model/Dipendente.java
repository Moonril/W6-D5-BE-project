package it.epicode.W6_D5_BE_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Dipendente {
    private int id;
    private String nome;
    private String cognome;
    private String username;
    private String email;

    @OneToOne
    @JoinColumn(name = "prenotazione_id")
    private Prenotazione prenotazione;

}
