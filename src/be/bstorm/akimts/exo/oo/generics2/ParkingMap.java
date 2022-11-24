package be.bstorm.akimts.exo.oo.generics2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ParkingMap<V extends Vehicule> {

    public static final int MAX_FLOOR = 'Z'- '@';
    public static final int PLACE_PER_FLOOR = 20;
    public static final int MAX_SIZE = MAX_FLOOR*PLACE_PER_FLOOR;
    private final int taille;
    private final Map<String, V> placesOccupees = new HashMap<>();

    public ParkingMap(int taille) {
        this.taille = taille;
    }

    public int getTaille() {
        return taille;
    }

    public String add(V vehicule){
        if( placesOccupees.size() == taille )
            throw new ParkingFullException();

        for (int i = 0; i < taille; i++) {
            String code = toCode(i);
            if( !placesOccupees.containsKey( code ) ){
                placesOccupees.put( code, vehicule );
                return code;
            }
        }

        // n'arrive jamais
        return null;
    }

    public V remove(String code){
        return placesOccupees.remove(code);
    }

    public V get(String code){
        if( isCodeInvalid(code) )
            throw new PlaceCodeException(code);

        return placesOccupees.get(code);
    }

    private static boolean isCodeInvalid(String code){
        if( code == null )
            return true;

        if( code.length() != 3 )
            return true;

        char etage = code.charAt(0);
        if( etage < 'A' || etage > 'Z')
            return true;

        try{
            int placeNumber = Integer.parseInt( code.substring(1) );
            if( placeNumber < 1 || placeNumber > PLACE_PER_FLOOR )
                return true;
        }
        catch (NumberFormatException ex){
            return true;
        }

        return false;
    }

    private static String toCode(int index){
        if( index < 0 || index >= MAX_SIZE )
            throw new IllegalArgumentException();

        return String.format("%c%02d", index/20 + 'A', (index%20)+1);
    }

}
