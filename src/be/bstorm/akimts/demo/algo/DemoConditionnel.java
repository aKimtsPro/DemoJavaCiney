package be.bstorm.akimts.demo.algo;

public class DemoConditionnel {

    public static void main(String[] args) {

        Personne p = new Personne("Dominique", 41);

        if( p.age >= 18 ){
            System.out.println("Vous êtes majeur");
        }
        else if( p.age >= 12 ){
            System.out.println("Vous êtes adolescent");
        }
        else if ( p.age >= 4 ){
            System.out.println("Vous êtes un enfant");
        }
        else {
            System.out.println("Vous êtes un bébé");
        }

        switch (p.nom){

            case "Pol":
            case "Luc":
                System.out.println("bonjour toi");
                break;

            case "Marie":
                System.out.println("hello marie");
                break;

            case "Dominique":
                System.out.println("salut dom");
                break;

            default:
                System.out.println("Euuh bonjour");

        }

        // Opérateur ternaire
        int age_de_p = p == null ? 0 : p.age;

    }

}
