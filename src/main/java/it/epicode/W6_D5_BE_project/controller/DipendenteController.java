package it.epicode.W6_D5_BE_project.controller;

import it.epicode.W6_D5_BE_project.service.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/dipendenti")
public class DipendenteController {

    @Autowired
    private DipendenteService dipendenteService;
}
