package be.bstorm.akimts.demo.exo.oo.aliment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        // Object - Aliment - LegumeFrais

        LegumeConserve lc = new LegumeConserve("petit pois", 200, 100);
        LegumeConserve lc2 = new LegumeConserve("petit pois", 200, 100);



        System.out.println( lc == lc2 ); // true

        String chaine = lc.toString();
    }

}
