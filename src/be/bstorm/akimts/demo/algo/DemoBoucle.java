package be.bstorm.akimts.demo.algo;

import java.util.Scanner;

public class DemoBoucle {

    public static void main(String[] args) {

        int oeufDansFrigo = 3;
        while( oeufDansFrigo-- > 0 ){
            // CODE
            System.out.println("Je casse un oeuf");
        }

        for (int oeuf = 3; oeuf-- > 0 ; System.out.println("Je casse un oeuf") ){
            // CODE
        }

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Je casse un oeuf");
        }

        String choix;
        Scanner sc = new Scanner( System.in );
        do {
            choix = sc.nextLine();
        } while ( !choix.equals("quitter") );


//        Scanner sc = new Scanner( System.in );
//        String choix = sc.nextLine();
//        while (!choix.equals("quitter")){
//            choix = sc.nextLine();
//        }
    }

}
