package be.bstorm.akimts.demo.oo.enums;

public enum Carburant implements FlagInterface {
    ESSENCE( 5.5 ),
    DIESEL( 4.5 ),
    ELECTRIQUE( 0 );

    private final double consommation;

    Carburant(double consommation) {
        this.consommation = consommation;
    }

    public double getConsommation() {
        return consommation;
    }

    public static Carburant getRandom(){
        Carburant[] allValues = values();
        int rdmIndex = (int)(Math.random() * allValues.length);
        return allValues[ rdmIndex ];
    }
}
