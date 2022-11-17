package be.bstorm.akimts.demo.exo.oo.hotel;

public class Chambre {

    private int numero = 1;
    private TypeChambre type;
    private int nbrPlace = 1;

    public Chambre(int numero, TypeChambre type, int nbrPlace) {
        this.setNumero( numero );
        this.type = type;
        this.setNbrPlace( nbrPlace );
    }

    public int getPrice(){
        return type.getPrix() * nbrPlace;
    }

    public boolean hasTele(){
        return type.isTelePresente();
    }

    public boolean hasDoucheIta(){
        return type.isDoucheItaPresente();
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if( numero > 0 )
            this.numero = numero;
    }

    public TypeChambre getType() {
        return type;
    }

    public void setType(TypeChambre type) {
        this.type = type;
    }

    public int getNbrPlace() {
        return nbrPlace;
    }

    public void setNbrPlace(int nbrPlace) {
        if( nbrPlace > 0 )
            this.nbrPlace = nbrPlace;
    }

}
