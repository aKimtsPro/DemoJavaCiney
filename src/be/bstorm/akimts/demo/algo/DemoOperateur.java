package be.bstorm.akimts.demo.algo;

public class DemoOperateur {

    public static void main(String[] args) {

        // Operateur
        // - arithmétiques

        int a=5, b=7;
        double rslt;

        rslt = a + b;
        rslt = a - b;
        rslt = a * b;
        rslt = a / b; // division entière // 0
        rslt = (double) a / b;
        rslt = a % b; // reste de la division entière // 5

        // - d'affectation

        rslt += 5;
        rslt = rslt + 5;
        rslt -= 5;
        rslt *= 5;
        rslt /= 5;
        rslt %= 5;

        rslt = 0;

        System.out.println( rslt++ ); // 0
        System.out.println( ++rslt ); // 2
        System.out.println( rslt-- ); // 2
        System.out.println( --rslt ); // 0


        // - de comparaison

        System.out.println( a == b ); // false
        System.out.println( a != b ); // true

        System.out.println( a < b ); // true
        System.out.println( a <= b ); // true
        System.out.println( a > b ); // false
        System.out.println( a >= b ); // false

        // - logique

        // OU - ||

        System.out.println( true || true ); // TRUE
        System.out.println( true || false ); // TRUE
        System.out.println( false || true ); // TRUE
        System.out.println( false || false ); // FALSE

        // ET - &&

        System.out.println( true && true ); // TRUE
        System.out.println( true && false ); // FALSE
        System.out.println( false && true ); // FALSE
        System.out.println( false && false ); // FALSE

        // NON - !

        System.out.println( !true ); // FALSE
        System.out.println( !false ); // VRAI

        // Loi de De Morgan

        // !(A || B) <=> !A && !B
        // !(A && B) <=> !A || !B

        // A     B          !(A || B)       !A && !B
        // true  true       false           false
        // true  false      false           false
        // false true       false           false
        // false false      true            true

        boolean estBleu = false, estLigne = false;

        System.out.println( !( estBleu && estLigne ) ); // n'est pas et bleu et ligné
        System.out.println( !estBleu || !estLigne ); // n'est pas bleu ou n'est pas ligné



    }

}
