package be.bstorm.akimts.exo.oo.generics2;

public class Velo extends Vehicule{

    private String color;

    public Velo(String marque, String modele, String color) {
        super(marque, modele);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
