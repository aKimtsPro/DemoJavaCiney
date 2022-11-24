package be.bstorm.akimts.exo.oo.generics2;

public class ParkingFullException extends RuntimeException {

    public ParkingFullException() {
        super("This parking is full");
    }
}
