package be.bstorm.akimts.exo.oo.enums;

public enum TypeChambre {

    BASIC( 50, false, false ),
    CONFORT( 70, true, false ),
    LUXE( 120, true, true );

    private final int prix;
    private final boolean telePresente;
    private final boolean doucheItaPresente;

    TypeChambre(int prix, boolean telePresente, boolean doucheItaPresente) {
        this.prix = prix;
        this.telePresente = telePresente;
        this.doucheItaPresente = doucheItaPresente;
    }

    public int getPrix() {
        return prix;
    }

    public boolean isTelePresente() {
        return telePresente;
    }

    public boolean isDoucheItaPresente() {
        return doucheItaPresente;
    }

    public static TypeChambre get( boolean tele, boolean douche ){
        if( tele && douche )
            return LUXE;
        if( !tele && !douche )
            return BASIC;
        if( tele )
            return CONFORT;

        return null;
    }
}
