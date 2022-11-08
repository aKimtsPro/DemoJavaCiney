package be.bstorm.akimts.demo.oo.interfaces;

public class Oiseau implements Volant {

    @Override
    public void voler(int nbrKm) {
        System.out.println("cuicui je vole " + nbrKm + " km");
    }

}
