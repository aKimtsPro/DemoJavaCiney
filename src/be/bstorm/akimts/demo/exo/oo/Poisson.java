package be.bstorm.akimts.demo.exo.oo;

public class Poisson extends EtreVivant {

    private int nbrNageoire = 4;

    public Poisson( int poid, int nbrNageoire ){
        super(poid);
        this.setNbrNageoire( nbrNageoire );
    }

    public int getNbrNageoire(){
        return nbrNageoire;
    }

    public void setNbrNageoire( int nbrNageoire ){
        if( nbrNageoire < this.nbrNageoire && nbrNageoire >= 4 && nbrNageoire <= 8 ){
            this.nbrNageoire = nbrNageoire;
        }
    }
}
