package be.bstorm.akimts.demo.oo.generics;

import be.bstorm.akimts.demo.oo.generics.contenu.Friandise;

import java.util.List;

public class BoiteFriandise<F extends Friandise> extends Boite<F> {

    public void addTo(List<? super F> liste){
        liste.add( getContenu() );
    }

}
