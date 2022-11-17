package be.bstorm.akimts.demo.oo.generics;

import be.bstorm.akimts.demo.oo.generics.contenu.Bille;
import be.bstorm.akimts.demo.oo.generics.contenu.Biscuit;
import be.bstorm.akimts.demo.oo.generics.contenu.Chocolat;
import be.bstorm.akimts.demo.oo.generics.contenu.Friandise;

public class Main {

    public static void main(String[] args) {

        Boite<Friandise> b = new Boite<>();

        Friandise contenu = b.getContenu();

        Boite<Friandise> bf = Boite.enrober(contenu);
        b.setContenu( new Biscuit() );
        b.setContenu( new Chocolat() );
        b.setContenu( new Friandise() );


        BoiteFriandise<Biscuit> boiteFriandise = new BoiteFriandise<>();





    }

}
