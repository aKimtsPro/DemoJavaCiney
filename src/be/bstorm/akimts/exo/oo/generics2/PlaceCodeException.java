package be.bstorm.akimts.exo.oo.generics2;

public class PlaceCodeException extends RuntimeException {

    private final String code;

    public PlaceCodeException(String code) {
        super(code + " n'est pas un code valid pour ce parking");
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
