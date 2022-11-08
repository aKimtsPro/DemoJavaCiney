package be.bstorm.akimts.demo.exo.oo.aliment;

import java.time.LocalDate;

public abstract class Aliment {

    private final String nom;
    private final LocalDate datePeremption;
    private final int calories;

    public abstract String getSaveur();

    public Aliment(String nom, LocalDate datePeremption, int calories) {
        this.nom = nom;
        this.datePeremption = datePeremption;
        this.calories = calories >= 0 ? calories : 0;
    }

    public String getNom() {
        return nom;
    }

    public LocalDate getDatePeremption() {
        return datePeremption;
    }

    public int getCalories() {
        return calories;
    }


    //    @Override
//    public boolean equals(Object obj) {
//        if( !(obj instanceof Aliment) ) {
//            return false;
//        }
//
//        Aliment a = (Aliment) obj;
//
//        return a.getNom() == this.getNom() &&
//                a.getCalories() == this.getCalories() &&
//                this.getDatePeremption().equals(a.getDatePeremption());
//    }
}
