package be.bstorm.akimts.demo.exo.oo.banque;

import be.bstorm.akimts.demo.oo.Compte;

import java.util.ArrayList;
import java.util.List;

public class Banque {

    private String nom;
    private final List<CompteCourant> compteCourants = new ArrayList<>();

    public Banque(String nom) {
        this.nom = nom;
    }

    public void ajouter(CompteCourant compte){
        compteCourants.add( compte );
    }

    public void supprimer(String numero){

        for (CompteCourant compteCourant : compteCourants) {
            if(compteCourant.getNumero().equals( numero )){
                compteCourants.remove(compteCourant);
                return;
            }
        }

    }

    public CompteCourant get(String numero){
        for (CompteCourant compteCourant : compteCourants) {
            if(compteCourant.getNumero().equals( numero ))
                return compteCourant;
        }
        return null;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<CompteCourant> getCompteCourants() {
        return new ArrayList<>(compteCourants);
    }

}
