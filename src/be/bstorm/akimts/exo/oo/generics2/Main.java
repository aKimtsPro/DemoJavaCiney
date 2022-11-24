package be.bstorm.akimts.exo.oo.generics2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> codes = new ArrayList<>();
        Parking<Velo> parking = new Parking<>(40);

        for (char etage = 'A'; etage <= 'B'; etage++) {
            for (int i = 1; i <= 20; i++) {
                parking.add(
                        new Velo(
                                String.valueOf(etage),
                                String.valueOf(i),
                                String.format("%c%2d", etage, i)));
            }
        }

        Vehicule v = parking.remove("B01");

        System.out.println(parking.nextPriority());

        parking.remove("A02");
//        parking.remove("A03");
        parking.remove("A04");
        parking.remove("A05");

        System.out.println(parking.nextPriority());

        System.out.println(parking.isFull());
    }

}
