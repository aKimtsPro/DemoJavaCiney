package be.bstorm.akimts.demo.oo;

public class Produit {

    double prix;
    String nom;
    String marque;
    int qtt;

    Produit(){
    }

    Produit(double prix, String nom, String marque, int qtt){
        this.prix = prix;
        this.nom = nom;
        this.marque = marque;
        this.qtt = qtt;
    }

    // type de retour
    // nom
    // parametre
    // corps de fonction
    // (modificateur d'accès)

    void restock( int qttRestock ){
        this.qtt += qttRestock;
    }


    // La signature d'une méthode garranti l'unicité de la méthode
    // - classe d'appartenance
    // - nom
    // - params

    //Ceci est une surcharge de "restock"
    void restock(){
        this.qtt += 1;
    }

    double prixTotal(){
        return this.prix * this.qtt;
    }

}
