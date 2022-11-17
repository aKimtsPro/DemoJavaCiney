package be.bstorm.akimts.exo.algo;

import java.util.Random;
import java.util.Scanner;

public class ToucheCoule2 {

    public static void main(String[] args) {


        // 01 - eau(inv./visi.) 23 - bateau(inv./visi.)
        int[][] plateau = new int[5][5];
        int trouve = 0;

        Random rdm = new Random();
        Scanner sc = new Scanner(System.in);


        // Génération des bateaux
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

            // region Choix de la case à cibler
            do {

                // region Choix X
                System.out.println("Quelle colonne? (0-4)");
                do {
                    choixX = Integer.parseInt( sc.nextLine() );
                    if(choixX < 0 || choixX >= plateau.length)
                        System.out.println("invalide, recommencez...");

                    // Tant que le choix n'est pas valide, je recommence
                } while(choixX < 0 || choixX >= plateau.length);
                // Je sais que choixX est entre 0 et 4
                // endregion

                // region Choix Y
                System.out.println("Quelle ligne? (0-4)");
                do {
                    choixY = Integer.parseInt( sc.nextLine() );
                    if(choixY < 0 || choixY >= plateau[choixY].length)
                        System.out.println("invalide, recommencez...");

                    // Tant que le choix n'est pas valide, je recommence
                } while(choixY < 0 || choixY >= plateau[choixY].length);
                // Je sais que choixY est entre 0 et 4
                // endregion

                if(plateau[choixX][choixY] % 2 == 1)
                    System.out.println("déjà choisi");

            // Si la case est déjà
            } while ( plateau[choixX][choixY] % 2 == 1 );
            // A partir d'ici la case choisie ne peut etre que 0(eau pas découverte) ou 2(bateau pas découverte)
            // endregion

            // region Verification de la présence du bateau
            // Si c'est un bateau
            if( plateau[choixX][choixY] == 2 ) {
                trouve++;
                System.out.println("touché (found: " + trouve + ", inconnu: " + (5 - trouve) + ")");
            }
            // Si c'est de l'eau (case == 0)
            else {
                System.out.println("plouf");
            }

            plateau[choixX][choixY]++; // 0->1 ou 2->3 (de non découvert à découvert que ce soit de l'eau ou un bateau)
            // endregion
        }

        displayFound(plateau);
        System.out.println("C'est gagné");

    }

    public static void displayFound(int[][] plateau){

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                if( plateau[i][j] % 2 == 0 )
                    System.out.print('_');
                else
                    System.out.print(plateau[i][j] == 1 ? '~' : 'O');
            }
            System.out.println();
        }

    }

    public static void display(int[][] plateau){

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                if( plateau[i][j] / 2 == 0 ) // eau
                    System.out.print("~");
                else // bateau
                    System.out.print("O");
            }
            System.out.println();
        }

    }


}
