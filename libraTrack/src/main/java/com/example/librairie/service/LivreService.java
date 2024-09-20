package com.example.librairie.service;

import com.example.librairie.model.Emprunt;
import com.example.librairie.model.Livre;

import com.example.librairie.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class LivreService {
    private EmpruntService empruntService;
    private final BookRepository bookRepository;
    LivreService(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    public boolean livreDisponible(String name){
        Livre livre=  bookRepository.findLivreByTitreLivre(name);
        return livre.getExemplaireDispo() > 0;
    }
    public void retourLivre(int codeLivre ){
        Livre livre=  bookRepository.findLivreByCodeLivre(codeLivre);
        if (livre.getExemplaireDispo() < livre.getExemplaireTotal()) {
            livre.setExemplaireDispo(livre.getExemplaireDispo() + 1);
            bookRepository.retourLivre(livre.getExemplaireDispo(),codeLivre);

        } else {
            System.out.println("Tous les exemplaires sont déjà disponibles.");
        }
    }
    public Livre rechercheLivre(int codLivre){
        Livre livre=bookRepository.findLivreByCodeLivre(codLivre);
        return  livre;
    }

    public void save(Livre livre) {
        bookRepository.save(livre);
    }
}
