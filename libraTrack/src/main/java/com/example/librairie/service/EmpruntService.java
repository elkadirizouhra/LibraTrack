package com.example.librairie.service;

import com.example.librairie.model.Emprunt;
import com.example.librairie.repository.EmpruntRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
@Service
public class EmpruntService {
    private final LivreService livreService;
    private final EmpruntRepository empruntRepository;
    EmpruntService(EmpruntRepository empruntRepository,LivreService livreService){
        this.empruntRepository=empruntRepository;
        this.livreService=livreService;
    }
    public String etatEmprunt(int id) {
        Emprunt emprunt=empruntRepository.findEmpruntById(id);
        if (emprunt.getDateReteurEffictive()== null) {
            if (emprunt.getDateReteurPrevue().after(new Date())) {
                return "En cours";
            } else {
                return "Non rendu";
            }
        } else if (emprunt.getDateReteurEffictive().after(emprunt.getDateReteurPrevue())) {
            return "Rendu avec retard";
        } else {
            return "Rendu à temps";
        }
    }
    public void reteurEmprunt(int codeEmprunt) {
        Emprunt emprunt = empruntRepository.findEmpruntById(codeEmprunt);
        emprunt.setDateReteurEffictive(new Date());
        empruntRepository.updateEmprunt(emprunt.getDateRetourEffective(),emprunt.getCodeEmprunt());
         livreService.retourLivre(emprunt.getCodeLivre());


    }
    public void ajouterEmprunt(int idEmprunteur , int codeLivre){
        Emprunt emprunt=new Emprunt();
        emprunt.setCodeLivre(codeLivre);
        emprunt.setIdEmprunteur(idEmprunteur);
        emprunt.setDateEmprunt(new Date());
        LocalDate datePrevue = LocalDate.now().plusDays(3);
        emprunt.setDateRetourPrevue(java.sql.Date.valueOf(datePrevue));
        empruntRepository.save(emprunt);

    }
}
