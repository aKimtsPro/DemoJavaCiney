package be.bstorm.akimts.demo;

import java.util.Random;

public class DemoTableau {

    public static void main(String[] args) {

        int a = 0;

        int[] tab = new int[4]; // { 0 , 0 , 0 , 0 }
        tab[0] = 14;
        tab[1] = 89;
        tab[2] = 645;
        tab[3] = 2078;

        tab = new int[]{ 14, 89, 645, 2078 };

        int[] tab2 = { 14, 89, 645, 2078 };

        for (int i = 0; i < tab.length; i++) {
            System.out.println( tab[i] );
        }

        // Attention variable par référence
        tab = tab2;
        tab2[0] = 5;
        System.out.println(tab[0]);


        // Le foreach (attention ne permet pas de modifier les cases du tableau)
        tab2 = new int[]{0,0,0,0};

        for (int i : tab2) {
            i++;
        }

        for (int i : tab2) {
            System.out.println( i );
        } // 0 0 0 0

        // tableau multidimensionel

        // plateau à 2 dim de taille 10x10, de pion où un pion est représenté par 'P',
        // et l'absence de pion par null

        Character[][] plateau = new Character[2][];
        plateau[0] = new Character[2];
        plateau[1] = new Character[2];

        plateau[0][0] = 'P';

        int[][][][][][][][][][][] tab3 = new int[1][1][1][1][1][1][1][1][1][1][1];



    }

}
