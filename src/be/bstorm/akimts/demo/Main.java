package be.bstorm.akimts.demo;

public class Main {
    public static void main(String[] args) {
        // primitifs

        // entiers
        byte b = 127; // 1Byte = -128;127
        short s = 32767; // 2Byte = -32k;32k
        int i = 2_000_000_000; // 4Byte
        long l = 2_000_000_000_000L;// 8Byte

        // reels
        float f = 8.1F; // 4Byte
        double d = 0.000468731357684321354; // 8Byte

        // autre
        boolean bool = true; // ~1bit
        char c = 'a'; // 2Byte // stocké comme un nombre

        // Wrappers
        Byte B = null;
        Short S;
        Integer I;
        Long L = 15L;

        Float F;
        Double D;

        Boolean Bool;
        Character C;

        // String est un type objet bizarre
        String chaine = "salut";
        String chaine2 = new String("salut");

        System.out.println(chaine); //  salut
        System.out.println(chaine2); //  salut
        System.out.println( chaine == chaine2); //  false

        System.out.println("Hello world!");


        // Eviter les problèmes de perf
        StringBuilder builder = new StringBuilder(chaine2);

        for (int j = 0; j < 100; j++) {
            builder.append('a');
        }

        chaine2 = builder.toString();

        // Les constantes

        final int TAUX_TVA = 21;
        final Personne P = new Personne("pol", 45);
//        p.nom = "pol"; // impossible


        // Convention de nommage

        // lowerCamelCase - variable, methodes
        // UpperCamelCase - Classes, Interfaces, Enum
        // lower_snake_case - variable
        // UPPER_SNAKE_CASE - constantes, valeurs d'Enum

        // Conversion

        // cast implicite (pas de perte d'info)
        i = s; // 2Byte -> 4Byte

        // cast explicite (perte d'info possible)
        i = (int) l; // 8Byte -> 4Byte

        // Attention char -> short doit être explicite
        s = (short) c;

        // Pour les objets aussi
        Object o = P;
        Personne personne = (Personne) o;

    }


}