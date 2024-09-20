package com.example.librairie.controller;

import com.example.librairie.model.Adherent;
import com.example.librairie.service.AdherentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("adherent")
public class AdherentController {
    private final AdherentService adherentService;
    AdherentController(AdherentService adherentService){
        this.adherentService=adherentService;
    }
    @PostMapping("/adhrent")
    public void ajouterAdherent(@RequestBody Adherent adherent){
        adherentService.saveAdherent(adherent);
    }
}
