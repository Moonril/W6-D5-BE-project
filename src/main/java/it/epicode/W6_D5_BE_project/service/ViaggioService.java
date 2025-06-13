package it.epicode.W6_D5_BE_project.service;

import it.epicode.W6_D5_BE_project.dto.ViaggioDto;
import it.epicode.W6_D5_BE_project.enums.StatoViaggio;
import it.epicode.W6_D5_BE_project.exceptions.NotFoundException;
import it.epicode.W6_D5_BE_project.model.Prenotazione;
import it.epicode.W6_D5_BE_project.model.Viaggio;
import it.epicode.W6_D5_BE_project.repository.ViaggioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

@Service
public class ViaggioService {

    @Autowired
    private ViaggioRepository viaggioRepository;


    public Viaggio saveViaggio(ViaggioDto viaggioDto){
        Viaggio viaggio = new Viaggio();

        viaggio.setDestinazione(viaggioDto.getDestinazione());
        viaggio.setDataViaggio(viaggioDto.getDataViaggio());

        return viaggioRepository.save(viaggio);
    }

    public Viaggio getViaggio(int id) throws NotFoundException{
        return viaggioRepository.findById(id).orElseThrow(() -> new NotFoundException("Viaggio con id: " + id + " non trovato"));
    }

    public Page<Viaggio> getAllViaggi(int page, int size, String sortBy){
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return viaggioRepository.findAll(pageable);
    }

    public Viaggio updateViaggio(int id, ViaggioDto viaggioDto) throws NotFoundException{
        Viaggio viaggioDaAggiornare = getViaggio(id);

        viaggioDaAggiornare.setDestinazione(viaggioDto.getDestinazione());
        viaggioDaAggiornare.setDataViaggio(viaggioDto.getDataViaggio());

        return viaggioRepository.save(viaggioDaAggiornare);
    }

    public void deleteViaggio(int id) throws NotFoundException{
        Viaggio viaggioDaCancellare = getViaggio(id);
        viaggioRepository.delete(viaggioDaCancellare);
    }

    //patch per cambiare stato
    //todo

//    public String patchViaggio(int id, String nuovoStato) throws NotFoundException, IOException {
//        Viaggio viaggioDaPatchare = getViaggio(id);
//
//        StatoViaggio statoEnum;
//        statoEnum = StatoViaggio.valueOf(nuovoStato.toUpperCase());
//        viaggioDaPatchare.setStatoViaggio(statoEnum); //???
//
//        return viaggioRepository.save(viaggioDaPatchare);
//
//    }

}
