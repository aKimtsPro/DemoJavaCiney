package be.bstorm.akimts.demo.oo;

import be.bstorm.akimts.demo.oo.enums.Carburant;
import be.bstorm.akimts.demo.oo.interfaces.Vehicule;

public class Voiture extends Vehicule {

    private Carburant carburant;

    public Voiture(Carburant carburant) {
        this.carburant = carburant;
    }

    public Carburant getCarburant() {
        return carburant;
    }

    public void setCarburant(Carburant carburant) {
        this.carburant = carburant;
    }


    public double getConsoMoyenne(){
        return carburant.getConsommation();
    }
}
