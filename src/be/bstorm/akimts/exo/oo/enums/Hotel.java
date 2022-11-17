package be.bstorm.akimts.exo.oo.enums;

import java.util.HashMap;
import java.util.Map;

public class Hotel {

    private final int etage;
    private final Map<Chambre, Boolean> chambres = new HashMap<>();

    public Hotel(int etage) {
        if( etage <= 0 )
            throw new RuntimeException( "etage should be positive" );

        this.etage = etage;
    }

    public void ajouter(Chambre chambre){

        if( chambre == null )
            throw new RuntimeException( "chambre ne devrait pas être null" );

        if( chambre.getNumero() / 100 >= etage )
            throw new RuntimeException( "chambre doit avoir un numero valide" );

        for (Chambre chambreKey : chambres.keySet()) {
            if( chambreKey.getNumero() == chambre.getNumero() )
                throw new RuntimeException( "chambre ne doit pas avoir un numéro déjà alloué" );
        }

        chambres.put( chambre, false );

    }

    public void supprimer(Chambre chambre) {
        if( chambres.containsKey(chambre) && estReserve(chambre) )
            throw new RuntimeException( "La chambre à supprimer ne peut être réservée" );

        if( chambre == null )
            throw new RuntimeException( "La chambre ne peut pas être null" );

        chambres.remove(chambre);
    }

    public void reserver(Chambre chambre){
        if( estReserve(chambre) )
            throw new RuntimeException( "Impossible de réserver une chambre réservée" );

        chambres.put( chambre, true );
    }

    public void liberer(Chambre chambre){
        if( !estReserve(chambre) )
            throw new RuntimeException( "Impossible de liberer une chambre qui n'est pas réservé" );

        chambres.put( chambre, false );
    }

    public boolean estReserve(Chambre chambre){
        if( !chambres.containsKey(chambre) )
            throw new RuntimeException("chambre should exist");

        return chambres.get(chambre);
    }

    public int getEtage() {
        return etage;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "etage=" + etage +
                ", chambres=" + chambres.size() +
                '}';
    }
}
