package be.bstorm.akimts.demo.exo.oo.banque;

import java.util.HashMap;
import java.util.Map;

public class BanqueV2 {

    private String nom;
    private final Map<String, CompteCourant> compteCourants = new HashMap<>();

    public BanqueV2(String nom) {
        this.nom = nom;
    }

    public void ajouter(CompteCourant compte){
        compteCourants.put( compte.getNumero(), compte );
    }

    public void supprimer(String numero){
        compteCourants.remove( numero );
    }

    public CompteCourant get(String numero){
        return compteCourants.get( numero );
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Map<String,CompteCourant> getCompteCourants() {
        return new HashMap<>(compteCourants);
    }

}
