package be.bstorm.akimts.demo.exo.oo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalDate deuxJourApres = date.plusDays(2);
        LocalDateTime dateTime = date.atTime(10, 29, 12);

        System.out.println( deuxJourApres );

    }

}
