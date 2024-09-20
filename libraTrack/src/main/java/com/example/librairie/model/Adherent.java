package com.example.librairie.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Adherent extends Personne {
    @Id
    private static int codeAdherent;
    private LocalDateTime dateAdhesion;


    public Adherent(String nom, String prenom) {
        super(nom, prenom);
        this.dateAdhesion = LocalDateTime.now();
    }

    public  int getCodeAdherent() {
        return codeAdherent;
    }

    public  void setCodeAdherent(int codeAdherent) {
        Adherent.codeAdherent = codeAdherent;
    }

    public LocalDateTime getDateAdhesion() {
        return dateAdhesion;
    }

    public void setDateAdhesion(LocalDateTime dateAdhesion) {
        this.dateAdhesion = dateAdhesion;
    }

    @Override
    public String toString() {
        return "Adherent{" +
                "nom"+getNom()+
                "prenom"+getPrenom()+
                "codeAdhesion"+getCodeAdherent()+
                "dateAdhesion=" + dateAdhesion +

                '}';
    }
}
