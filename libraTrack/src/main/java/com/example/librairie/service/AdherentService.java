package com.example.librairie.service;

import com.example.librairie.model.Adherent;
import com.example.librairie.repository.AdherentRepository;
import org.springframework.stereotype.Service;

@Service
public class AdherentService {
    private final AdherentRepository adherentRepository;
    AdherentService(AdherentRepository adherentRepository){
        this.adherentRepository=adherentRepository;
    }
    public Adherent rechercheAdherent(int id){
     Adherent adherent=adherentRepository.findAdherentById(id);
        return adherent;
    }
    public void saveAdherent(Adherent adherent){
        adherentRepository.save(adherent);
    }

}
