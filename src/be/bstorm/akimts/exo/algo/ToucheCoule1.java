package be.bstorm.akimts.exo.algo;

import java.util.Random;
import java.util.Scanner;

public class ToucheCoule1 {

    public static void main(String[] args) {

        boolean[] plateau = new boolean[10];

        Random rdm = new Random();
        Scanner sc = new Scanner(System.in);
        boolean gagne = false;

        int positionRandom = rdm.nextInt( plateau.length );
        plateau[ positionRandom ] = true;

        int choix;

        while( !gagne ){
            System.out.println("Ou viser? (0-9)");

            do {
                choix = Integer.parseInt( sc.nextLine() );
                if(choix < 0 || choix >= plateau.length)
                    System.out.println("invalide, recommencez...");
            } while(choix < 0 || choix >= plateau.length);


            if( plateau[choix] ) {
                gagne = true;
                System.out.println("touché");
            }
            else
                System.out.println("plouf");
        }

        System.out.println("C'est gagné");

    }

}
