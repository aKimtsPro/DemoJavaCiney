package be.bstorm.akimts.demo.oo;

import be.bstorm.akimts.demo.oo.enums.Carburant;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Voiture v = new Voiture( Carburant.ELECTRIQUE );

        Carburant carburant = v.getCarburant();
        System.out.println(carburant.ordinal());

        Carburant[] allValues = Carburant.values();
        Carburant stringToCarburant = Carburant.valueOf( "DIESEL" );
        String carburantToString = v.getCarburant().toString();

        // Carburant random
        Carburant random = Carburant.getRandom();

        LinkedList<Carburant> list = new LinkedList<>();

    }

}
