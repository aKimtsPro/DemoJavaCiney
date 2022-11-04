package be.bstorm.akimts.demo.exo.oo;

public class EtreVivant {

    private int poid = 1;

    public EtreVivant( int poid ){
        this.setPoid( poid );
    }

    public int seNourrir(){
        return this.poid *= 1.05;
    }

    public int getPoid(){
        return poid;
    }

    private void setPoid(int poid){
        if( poid > 0 ) {
            this.poid = poid;
        }
    }

}
