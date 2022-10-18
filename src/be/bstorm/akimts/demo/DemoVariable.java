package be.bstorm.akimts.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DemoVariable {

    public static void main(String[] args) {
//         salut
        /*

        comm en plusieurs lignes

         */

        // TODO continuer le cours
        System.out.println("Autre programme");

        // Récupérer un nombre de l'utilisateur
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        int valeur = Integer.parseInt( line );



        String a = "salut";
        String b = "salu" + 't';

        System.out.println( a.toString() == b ); // true

        StringBuilder abuilder = new StringBuilder("salut");
        for (int i = 0; i < 1_000_000; i++) {
            abuilder.append('o');
        }




    }

}
