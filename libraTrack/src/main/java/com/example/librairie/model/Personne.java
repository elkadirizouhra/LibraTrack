package com.example.librairie.model;

import org.springframework.data.annotation.Id;

public class Personne {
    @Id
    int id ;
    private String nom;
    private String prenom;

    Personne(){}
    public Personne(String nom, String prenom) {
        this.nom=nom;
        this.prenom=prenom;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
