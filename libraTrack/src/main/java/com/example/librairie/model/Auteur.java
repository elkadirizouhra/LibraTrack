package com.example.librairie.model;

public class Auteur extends Personne{
    private int CodeAuteur;

    public int getCodeAuteur() {
        return CodeAuteur;
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "CodeAuteur=" + CodeAuteur +
                '}';
    }

    public void setCodeAuteur(int codeAuteur) {
        CodeAuteur = codeAuteur;
    }
}
