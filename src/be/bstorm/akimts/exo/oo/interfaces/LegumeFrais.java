package be.bstorm.akimts.exo.oo.interfaces;

import java.time.LocalDate;

public class LegumeFrais extends Aliment {

    private final LocalDate dateRecolte;

    public LegumeFrais( String nom, LocalDate dateRecolte, int calories ){
        super( nom, dateRecolte.plusDays(2), calories );
        this.dateRecolte = dateRecolte;
    }

    public LocalDate getDateRecolte() {
        return dateRecolte;
    }

    @Override
    public String getSaveur() {
        return "sucré";
    }


}
