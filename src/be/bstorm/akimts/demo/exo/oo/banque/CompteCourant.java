package be.bstorm.akimts.demo.exo.oo.banque;

import java.util.HashMap;

public class CompteCourant {

    private String numero;
    private double solde;
    private double ligneDeCredit;
    private Personne titulaire;

    public CompteCourant(String numero, Personne titulaire) {
        this.numero = numero;
        this.titulaire = titulaire;
    }

    public CompteCourant(String numero, double ligneDeCredit, Personne titulaire) {
        this.numero = numero;
        this.setLigneDeCredit( ligneDeCredit );
        this.titulaire = titulaire;
    }

    public void retrait(double montant){
        if(montant > 0 && solde-montant > -ligneDeCredit )
            solde -= montant;
    }

    public void depot(double montant){
        if( montant > 0 )
            solde += montant;
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) {
        this.solde = solde;
    }

    public double getLigneDeCredit() {
        return ligneDeCredit;
    }

    public void setLigneDeCredit(double ligneDeCredit) {
        if (ligneDeCredit >= 0)
            this.ligneDeCredit = ligneDeCredit;
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        this.titulaire = titulaire;
    }
}
