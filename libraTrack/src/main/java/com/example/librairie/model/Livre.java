package com.example.librairie.model;

import org.springframework.data.annotation.Id;

public class Livre {
    @Id
    private int codeLivre;
    private String titreLivre;
    private int  codeAuteur;
    private int exemplaireDispo;
    private int exemplaireTotal;

    public int getCodeLivre() {
        return codeLivre;
    }

    public void setCodeLivre(int codeLivre) {
        this.codeLivre = codeLivre;
    }

    public String getTitreLivre() {
        return titreLivre;
    }

    public void setTitreLivre(String titreLivre) {
        this.titreLivre = titreLivre;
    }

    public int getCodeAuteur() {
        return codeAuteur;
    }

    public void setCodeAuteur(int codeAuteur) {
        this.codeAuteur = codeAuteur;
    }

    public int getExemplaireDispo() {
        return exemplaireDispo;
    }

    public void setExemplaireDispo(int exemplaireDispo) {
        this.exemplaireDispo = exemplaireDispo;
    }

    public int getExemplaireTotal() {
        return exemplaireTotal;
    }

    public void setExemplaireTotal(int exemplaireTotal) {
        this.exemplaireTotal = exemplaireTotal;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "codeLivre=" + codeLivre +
                ", titreLivre='" + titreLivre + '\'' +
                ", codeAuteur=" + codeAuteur +
                ", exemplaireDispo=" + exemplaireDispo +
                ", exemplaireTotal=" + exemplaireTotal +
                '}';
    }
}
