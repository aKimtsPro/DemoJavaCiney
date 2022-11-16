package be.bstorm.akimts.demo.exo.oo.hotel;

public class Main {

    public static void main(String[] args) {

        Chambre chambre = new Chambre( 1, TypeChambre.LUXE, 2 );
        System.out.println( "prix de la chambre : " + chambre.getPrice() );
        System.out.println( chambre.hasTele() ? "a une télé" : "n'a pas de télé" );
        System.out.println( chambre.hasDoucheIta() ? "a une douche italienne" : "n'a pas de douche italienne" );

    }

}
