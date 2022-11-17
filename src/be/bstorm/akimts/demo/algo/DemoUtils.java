package be.bstorm.akimts.demo.algo;

import java.util.Scanner;

public class DemoUtils {

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
