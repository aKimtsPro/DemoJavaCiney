package be.bstorm.akimts.exo.oo.interfaces;

public class Main {

    public static void main(String[] args) {

        // Object - Aliment - LegumeFrais

        LegumeConserve lc = new LegumeConserve("petit pois", 200, 100);
        LegumeConserve lc2 = new LegumeConserve("petit pois", 200, 100);



        System.out.println( lc == lc2 ); // true

        String chaine = lc.toString();
    }

}
