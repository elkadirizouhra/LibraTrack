package com.example.librairie.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Emprunt {
    @Id
    private int codeEmprunt;
    private int codeLivre;
    private int  idEmprunteur;
    private Date dateEmprunt;
    private Date dateRetourPrevue;
    private Date dateRetourEffective;

    public int getCodeEmprunt() {
        return codeEmprunt;
    }

    public void setCodeEmprunt(int codeEmprunt) {
        this.codeEmprunt = codeEmprunt;
    }




    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public Date getDateReteurPrevue() {
        return dateRetourPrevue;
    }

    public void setDateReteurPrevue(Date dateReteurPrevue) {
        this.dateRetourPrevue = dateReteurPrevue;
    }

    public Date getDateReteurEffictive() {
        return dateRetourEffective;
    }

    public void setDateReteurEffictive(Date dateReteurEffictive) {
        this.dateRetourEffective = dateReteurEffictive;
    }

    public int getCodeLivre() {
        return codeLivre;
    }

    public void setCodeLivre(int codeLivre) {
        this.codeLivre = codeLivre;
    }

    public int getIdEmprunteur() {
        return idEmprunteur;
    }

    public void setIdEmprunteur(int idEmprunteur) {
        this.idEmprunteur = idEmprunteur;
    }

    public Date getDateRetourPrevue() {
        return dateRetourPrevue;
    }

    public void setDateRetourPrevue(Date dateRetourPrevue) {
        this.dateRetourPrevue = dateRetourPrevue;
    }

    public Date getDateRetourEffective() {
        return dateRetourEffective;
    }

    public void setDateRetourEffective(Date dateRetourEffective) {
        this.dateRetourEffective = dateRetourEffective;
    }
}

