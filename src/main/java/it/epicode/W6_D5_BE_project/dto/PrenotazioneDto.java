package it.epicode.W6_D5_BE_project.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PrenotazioneDto {

    @NotNull(message = "Inserisci stato attuale del viaggio")
    private LocalDate dataRichiesta;
    private String preferenze;
    // collegamenti
    //todo
}
