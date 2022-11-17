package be.bstorm.akimts.exo.oo.generics;

import java.time.LocalDate;
import java.time.Period;

public class Patineur extends Sportif {

    public Patineur(LocalDate debutCarriere) {
        super(debutCarriere);
    }

    @Override
    public double performer() {
        return 40 + (getNbrMedailles() > 0 ? 1.5 : 1 ) * getAnciennete();
    }

    public int getAnciennete(){
        return Period.between(LocalDate.now(), getDebutCarriere()).getYears();
    }
}
