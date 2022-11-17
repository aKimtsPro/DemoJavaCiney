package be.bstorm.akimts.exo.oo.heritage;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Personne p = new Personne("Dubois", "Luc", LocalDate.now());
        BanqueV2 banque = new BanqueV2("MaBank");

        banque.ajouter(new CompteCourant("1", p));
        Compte c = banque.get( "1" );

        c.depot( 1500 );
        c.retrait( 1600 );


        if( c instanceof CompteCourant ){
            CompteCourant cc = (CompteCourant) c;
            cc.setLigneDeCredit(100);
        }

        c.retrait( 1600 );

        banque.supprimer( c.getNumero() );
        System.out.println("Le compte a été supprimé");

    }

}
