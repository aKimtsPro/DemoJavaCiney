package be.bstorm.akimts.demo.oo;

import be.bstorm.akimts.demo.exo.oo.Personne;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Produit produit = new Produit();
        produit.marque = "marc";
        produit.nom = "modele";
        produit.prix = 1;
        produit.qtt = 5;

        Personne p = new Personne();
        p.nom = "ok";

        produit.restock( 5 );

        Produit p2 = new Produit();

        System.out.println( p2.marque ); // ?


        Compte c = new Compte();
    }

}
