package com.example.librairie.controller;

import com.example.librairie.DTO.empruntDTO;
import com.example.librairie.service.EmpruntService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emprunt")
public class EmpruntController {
    private final EmpruntService empruntService;
    EmpruntController(EmpruntService empruntService ){
        this.empruntService=empruntService;
    }

    @PostMapping("/emprunt")
    public void ajouterEmprunt(@RequestBody empruntDTO empruntDTO){
        int idEmprunteur=empruntDTO.getIdEmprunteur();
        int codeLivre=empruntDTO.getCodeLivre();
        empruntService.ajouterEmprunt(idEmprunteur,codeLivre);
    }
    @GetMapping("/etatEmprunt/{id}")
    public String etatEmprunt(@PathVariable int id){
        return empruntService.etatEmprunt(id);
    }

    @PutMapping("/emprunt/{codeEmprunt}")
    public void reteurEmprunt(@PathVariable int codeEmprunt){
        empruntService.reteurEmprunt(codeEmprunt);

    }
}
