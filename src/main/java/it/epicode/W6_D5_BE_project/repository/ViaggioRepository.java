package it.epicode.W6_D5_BE_project.repository;

import it.epicode.W6_D5_BE_project.model.Viaggio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViaggioRepository extends JpaRepository<Viaggio, Integer> {
}
