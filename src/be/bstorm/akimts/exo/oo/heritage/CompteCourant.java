package be.bstorm.akimts.exo.oo.heritage;


public class CompteCourant extends Compte {

    private double ligneDeCredit;

    public CompteCourant(String numero, Personne titulaire) {
        super(numero, titulaire);
    }

    public CompteCourant(String numero, double ligneDeCredit, Personne titulaire) {
        super(numero, titulaire);
        this.setLigneDeCredit( ligneDeCredit );
    }

    @Override
    public void retrait(double montant){
        if(getSolde()-montant > -ligneDeCredit )
            super.retrait( montant );
    }

    public double getLigneDeCredit() {
        return ligneDeCredit;
    }

    public void setLigneDeCredit(double ligneDeCredit) {
        if (ligneDeCredit >= 0)
            this.ligneDeCredit = ligneDeCredit;
    }

}
