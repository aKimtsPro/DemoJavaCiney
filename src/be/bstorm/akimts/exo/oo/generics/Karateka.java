package be.bstorm.akimts.exo.oo.generics;

import java.time.LocalDate;
import java.util.Map;

public class Karateka extends Sportif{
    private int poid;

    public Karateka(LocalDate debutCarriere, int poid) {
        super(debutCarriere);

        if( poid < 50 )
            throw new IllegalArgumentException("poid < 50");

        this.poid = poid;
    }

    @Override
    public double performer() {
        return 50 + Math.random() * (getNbrMedailles() > 0 ? 2 : 1.5) * poid;
    }
}
