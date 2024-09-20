package com.example.librairie.DTO;

public class empruntDTO {

        private int idEmprunteur;
        private int codeLivre;
        private int codeEmprunt;

    public int getCodeEmprunt() {
        return codeEmprunt;
    }

    public void setCodeEmprunt(int codeEmprunt) {
        this.codeEmprunt = codeEmprunt;
    }

    // Getters et setters
        public int getIdEmprunteur() {
            return idEmprunteur;
        }

        public void setIdEmprunteur(int idEmprunteur) {
            this.idEmprunteur = idEmprunteur;
        }

        public int getCodeLivre() {
            return codeLivre;
        }

        public void setCodeLivre(int codeLivre) {
            this.codeLivre = codeLivre;
        }
    }


