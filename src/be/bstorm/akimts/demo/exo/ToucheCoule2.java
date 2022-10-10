package be.bstorm.akimts.demo.exo;

import java.util.Random;
import java.util.Scanner;

public class ToucheCoule2 {

    public static void main(String[] args) {


        // 01 - eau(inv./visi.) 23 - bateau(inv./visi.)
        int[][] plateau = new int[5][5];
        int trouve = 0;

        Random rdm = new Random();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) { // attention, proba d'infini
            int x = rdm.nextInt( 5 ), y = rdm.nextInt( 5 );
            if( plateau[x][y] != 2 )
                plateau[x][y] = 2;
            else
                i--;
        }

        display(plateau);

        int choixX, choixY;

        while( trouve < 5 ){
            displayFound(plateau);

            do {

                System.out.println("Quelle colonne? (0-4)");
                do {
                    choixX = Integer.parseInt( sc.nextLine() );
                    if(choixX < 0 || choixX >= plateau.length)
                        System.out.println("invalide, recommencez...");
                } while(choixX < 0 || choixX >= plateau.length);

                System.out.println("Quelle ligne? (0-4)");
                do {
                    choixY = Integer.parseInt( sc.nextLine() );
                    if(choixY < 0 || choixY >= plateau[choixY].length)
                        System.out.println("invalide, recommencez...");
                } while(choixY < 0 || choixY >= plateau[choixY].length);

                if(plateau[choixX][choixY] %2 == 1)
                    System.out.println("déjà choisi");

            } while ( plateau[choixX][choixY] %2 == 1 );


            if( plateau[choixX][choixY] == 2 )
                System.out.println("touché (found: " + (++trouve) + ", inconnu: " + (5 - trouve) + ")");

            else
                System.out.println("plouf");

            plateau[choixX][choixY]++;
        }

        displayFound(plateau);
        System.out.println("C'est gagné");

    }

    public static void displayFound(int[][] plateau){

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                switch ( plateau[i][j] ){
                    case 0:
                    case 2:
                        System.out.print("_");
                        break;
                    case 1:
                        System.out.print("~");
                        break;
                    case 3:
                        System.out.print("X");
                        break;
                }
            }
            System.out.println();
        }

    }

    public static void display(int[][] plateau){

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                switch ( plateau[i][j] ){
                    case 0:
                    case 1:
                        System.out.print("~");
                        break;
                    case 2:
                    case 3:
                        System.out.print("O");
                        break;
                }
            }
            System.out.println();
        }

    }


}
