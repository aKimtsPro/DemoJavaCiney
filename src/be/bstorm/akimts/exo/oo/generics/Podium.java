package be.bstorm.akimts.exo.oo.generics;

public class Podium<S extends Sportif> {

    private final S or, argent, bronze;

    public Podium(S or, S argent, S bronze) {
        this.or = or;
        this.argent = argent;
        this.bronze = bronze;
    }

    public S getOr() {
        return or;
    }

    public S getArgent() {
        return argent;
    }

    public S getBronze() {
        return bronze;
    }
}
