package be.bstorm.akimts.demo.exo.oo;

public class Main {

    public static void main(String[] args) {

//        Personne p = new Personne();
//        Personne p = new Personne("Dupont", "Luc");
        Personne p = new Personne("Dupont", "Luc", 250,85);
//        p.nom = "Dupont";
//        p.prenom = "Luc";
//        p.dateNaissance = "10/10/1990";
//        p.poid = 185;
//        p.taille = 85;

        System.out.println( p.getTaille() ); // 0

        p.sePresenter();
        p.saluer(p);
        System.out.println("IMC: " + p.calculerIMC());
    }

}
