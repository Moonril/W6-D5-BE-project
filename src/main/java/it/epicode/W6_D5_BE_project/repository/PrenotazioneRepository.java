package it.epicode.W6_D5_BE_project.repository;

import it.epicode.W6_D5_BE_project.model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Integer> {
}
