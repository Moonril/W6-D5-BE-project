package it.epicode.W6_D5_BE_project.dto;

import it.epicode.W6_D5_BE_project.enums.StatoViaggio;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ViaggioDto {
    @NotEmpty(message = "Inserisci una destinazione")
    private String destinazione;
    @NotNull(message = "Inserisci una data corretta")
    private LocalDate dataViaggio;
    // collegamenti
    //todo
}
