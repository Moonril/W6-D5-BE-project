package it.epicode.W6_D5_BE_project.service;

import it.epicode.W6_D5_BE_project.dto.PrenotazioneDto;
import it.epicode.W6_D5_BE_project.exceptions.NotFoundException;
import it.epicode.W6_D5_BE_project.model.Prenotazione;
import it.epicode.W6_D5_BE_project.repository.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public Prenotazione savePrenotazione(PrenotazioneDto prenotazioneDto){
        Prenotazione prenotazione = new Prenotazione();

        prenotazione.setPreferenze(prenotazioneDto.getPreferenze());
        prenotazione.setDataRichiesta(prenotazioneDto.getDataRichiesta());
        //aggiungere i due collegamenti? //todo


        return prenotazioneRepository.save(prenotazione);
    }

    public Prenotazione getPrenotazione(int id) throws NotFoundException {
        return prenotazioneRepository.findById(id).orElseThrow(() -> new NotFoundException("Prenotazione con id: " + id + " non trovata"));
    }

    public Page<Prenotazione> getAllPrenotazioni(int page, int size, String sortBy){
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return prenotazioneRepository.findAll(pageable);
    }

    public Prenotazione updatePrenotazione(int id, PrenotazioneDto prenotazioneDto) throws NotFoundException{
        Prenotazione prenotazioneDaAggiornare = getPrenotazione(id);

        prenotazioneDaAggiornare.setPreferenze(prenotazioneDto.getPreferenze());
        prenotazioneDaAggiornare.setDataRichiesta(prenotazioneDto.getDataRichiesta());

        //todo
//        if(prenotazioneDaAggiornare.getAutore().getId()!=blogDto.getAuthorId()){
//            Author author = authorService.getAuthor(blogDto.getAuthorId());
//            blogToUpdate.setAutore(author);
//        }
        return prenotazioneRepository.save(prenotazioneDaAggiornare);
    }

    public void deletePrenotazione(int id) throws NotFoundException{
        Prenotazione prenotazioneToDelete = getPrenotazione(id);
        prenotazioneRepository.delete(prenotazioneToDelete);
    }

    //

}
