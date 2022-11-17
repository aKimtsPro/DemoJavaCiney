package be.bstorm.akimts.demo.oo.exceptions;

public class TacheAlreadyAddedException extends RuntimeException {

    public TacheAlreadyAddedException() {
        super( "La tache existe déjà dans l'agenda" );
    }

}
