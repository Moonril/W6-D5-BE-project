package it.epicode.W6_D5_BE_project.service;

import it.epicode.W6_D5_BE_project.repository.DipendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DipendenteService {

    @Autowired
    private DipendenteRepository dipendenteRepository;
}
