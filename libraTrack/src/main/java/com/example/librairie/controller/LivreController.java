package com.example.librairie.controller;

import com.example.librairie.DTO.livreDTO;
import com.example.librairie.model.Adherent;
import com.example.librairie.model.Livre;
import com.example.librairie.service.AdherentService;
import com.example.librairie.service.LivreService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("livre")
public class LivreController {
    private final LivreService livreService;

    LivreController(LivreService livreService){
        this.livreService=livreService;

    }
    @PostMapping("/livre")
    public void ajouterLivre(@RequestBody Livre livre){
        livreService.save(livre);
    }
    @GetMapping("livre/{codLivre}")
    public Livre rechercheLivre(@PathVariable int codLivre){
           return livreService.rechercheLivre(codLivre);
    }
    @GetMapping("/livreDispo/{titre_livre}")
    public Boolean livreDisponible(@PathVariable String titre_livre ){

           return livreService.livreDisponible(titre_livre);
    }





}
