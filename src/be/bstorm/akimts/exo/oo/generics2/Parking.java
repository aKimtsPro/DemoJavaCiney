package be.bstorm.akimts.exo.oo.generics2;

import java.util.LinkedList;

public class Parking<V extends Vehicule> {
    public static final int MAX_FLOOR = 'Z'- 'A' + 1;
    public static final int PLACE_PER_FLOOR = 20;
    public static final int MAX_SIZE = MAX_FLOOR*PLACE_PER_FLOOR;


    private final int capacity;
    private final Vehicule[][] places;
    private final LinkedList<String> priorityFreePlace = new LinkedList<>();


    public Parking(int capacity) {
        if( capacity < 1 || capacity > MAX_SIZE)
            throw new IllegalArgumentException("nbrPlace: min 1, max 520");

        this.capacity = capacity;
        this.places = generateParking();
        priorityFreePlace.add("A01");
    }

    public int getFloorQtt(){
        return ( capacity / 20 ) + ( capacity %20 > 0 ? 1 : 0 );
    }

    public boolean isFull(){
        for (Vehicule[] place : places) {
            for (Vehicule vehicule : place) {
                if( vehicule == null )
                    return false;
            }
        }
        return true;
    }

    private Vehicule[][] generateParking(){
        Vehicule[][] places = new Vehicule[getFloorQtt()][];

        for (int i = 0; i < getFloorQtt()-1; i++) {
            places[i] = new Vehicule[PLACE_PER_FLOOR];
        }

        // 15
        // A20
        // B20
        // C20
        // D15

        int placeOnLast = capacity % PLACE_PER_FLOOR > 0 ? capacity%PLACE_PER_FLOOR : PLACE_PER_FLOOR;
        places[getFloorQtt()-1] = new Vehicule[placeOnLast];
        return places;
    }

    private String previousPlace(String code){

        if( code == null || isCodeInvalid( code ) )
            throw new IllegalArgumentException();

        if( code.equals("A01") )
            return null;

        int nextPlaceIndex = placeIndex(code)-1;
        int nextFloorIndex = floorIndex(code);
        if( nextPlaceIndex < 0 ){
            nextPlaceIndex = PLACE_PER_FLOOR-1;
            nextFloorIndex--;
        }

        String nextPlace = toCode(nextFloorIndex, nextPlaceIndex);
        return placeIsPossible(nextPlace) ? nextPlace : null;
    }
    private String nextPlace(String code){
        if( code == null || isCodeInvalid( code ) )
            throw new IllegalArgumentException();

        if( code.equals("Z20") )
            return null;

        int nextPlaceIndex = placeIndex(code)+1;
        int nextFloorIndex = floorIndex(code);
        if( nextPlaceIndex >= PLACE_PER_FLOOR ){
            nextPlaceIndex = 0;
            nextFloorIndex++;
        }

        String nextPlace = toCode(nextFloorIndex, nextPlaceIndex);
        return placeIsPossible(nextPlace) ? nextPlace : null;
    }

    public String add(V vehicule){
        if( isFull() )
            throw new ParkingFullException();

//        if(priorityFreePlace.isEmpty())
//            throw new ParkingFullException();

        if( vehicule == null )
            throw new IllegalArgumentException();

        String code = priorityFreePlace.pop();
        places[floorIndex(code)][placeIndex(code)] = vehicule;

        priorityFreePlace.remove(code);
        String nextPlace = nextPlace( code );
        if( !isCodeInvalid(code)
                && placeIsPossible(nextPlace)
                && get( nextPlace ) == null ){
            placeIntoPriority(nextPlace); // De facon à avoir des places croissantes
        }
        return code;
    }

    public V get(String code){
        if( isCodeInvalid(code) || !placeIsPossible(code) )
            throw new IllegalArgumentException("code invalid");

        return (V) places[floorIndex(code)][placeIndex(code)];
    }

    public V remove(String code){

        V removed = get( code );
        places[floorIndex(code)][placeIndex(code)] = null;

        if( get( previousPlace(code) ) != null )
            placeIntoPriority( code );
        priorityFreePlace.remove( nextPlace(code) );

        return removed;

    }

    private void placeIntoPriority(String code){
        if( !placeIsPossible( code ) )
            return;

        if (priorityFreePlace.isEmpty())
            priorityFreePlace.addFirst(code);
        else
            for (int i = 0; i < priorityFreePlace.size(); i++) {
                if( compare(code, priorityFreePlace.get(i)) < 0){
                    priorityFreePlace.add(i, code);
                    return;
                }
            }
    }

    public String nextPriority(){
        return priorityFreePlace.getFirst();
    }

    private static String toCode(int indexEtage, int indexPlace){
        return String.format("%c%02d",indexEtage+'A',indexPlace+1);
    }

    private static int floorIndex(String code){
        if(isCodeInvalid(code))
            throw new IllegalArgumentException("Code invalid");

        return code.charAt(0)-'A';
    }

    private static int placeIndex(String code){
        if(isCodeInvalid(code))
            throw new IllegalArgumentException("Code invalid");

        return Integer.parseInt( code.substring(1) )-1;
    }

    public static int compare(String code1, String code2){
        int index1 = floorIndex(code1) * PLACE_PER_FLOOR + placeIndex(code1);
        int index2 = floorIndex(code2) * PLACE_PER_FLOOR + placeIndex(code2);
        return index1 - index2;
    }



    private boolean placeIsPossible(String code){
        if( code == null )
            return false;

        return (floorIndex(code) * PLACE_PER_FLOOR + placeIndex(code)) < capacity;
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



}
