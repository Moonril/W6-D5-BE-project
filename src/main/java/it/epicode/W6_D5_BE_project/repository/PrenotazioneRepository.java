package it.epicode.W6_D5_BE_project.repository;

import it.epicode.W6_D5_BE_project.model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Integer> {

    List<Prenotazione> findByDipendenteIdAndDataRichiesta(Integer dipendenteId, LocalDate dataRichiesta);
}
