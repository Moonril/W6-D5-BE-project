package it.epicode.W6_D5_BE_project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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
    private String urlAvatar = "";

    @JsonIgnore
    @OneToMany(mappedBy = "dipendente")
    private List<Prenotazione> prenotazioni;

}
