package be.bstorm.akimts.demo.oo;

public class Compte {

    private double solde;

    protected double getSolde(){
        return solde;
    }

    void setSolde(double solde){
        if( solde >= 0 ){
            this.solde = solde;
        }
    }

}
