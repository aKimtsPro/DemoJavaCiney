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
        Long L = l;

        Float F;
        Double D;

        Boolean Bool;
        Character C;

        System.out.println("Hello world!");
    }
}