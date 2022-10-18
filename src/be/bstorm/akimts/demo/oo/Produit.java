package be.bstorm.akimts.demo.oo;

public class Produit {

    double prix;
    String nom;
    String marque;
    int qtt;


    // type de retour
    // nom
    // parametre
    // corps de fonction
    // (modificateur d'accès)

    void restock( int qttRestock ){
        this.qtt += qttRestock;
    }

    double prixTotal(){
        return this.prix * this.qtt;
    }

}
