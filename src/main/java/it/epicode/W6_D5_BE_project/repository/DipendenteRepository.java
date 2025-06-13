package it.epicode.W6_D5_BE_project.repository;

import it.epicode.W6_D5_BE_project.model.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DipendenteRepository extends JpaRepository<Dipendente, Integer> {
}
