package be.bstorm.akimts.demo.exo.oo.banque;

import be.bstorm.akimts.demo.oo.Compte;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Personne p = new Personne("Dubois", "Luc", LocalDate.now());
        BanqueV2 banque = new BanqueV2("MaBank");

        banque.ajouter(new CompteCourant("1", p));
        CompteCourant c = banque.get( "1" );

        c.depot( 1500 );
        c.retrait( 1600 );
        c.setLigneDeCredit( 100 );
        c.retrait( 1600 );

        if( banque.supprimer( c.getNumero() ) )
            System.out.println("Le compte a été supprimé");

    }

}
