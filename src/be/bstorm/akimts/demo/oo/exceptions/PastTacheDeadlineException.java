package be.bstorm.akimts.demo.oo.exceptions;

import java.time.LocalDate;

public class PastTacheDeadlineException extends RuntimeException {

    private final LocalDate deadline;
    private final LocalDate dateAgenda;

    public PastTacheDeadlineException(LocalDate deadline, LocalDate dateAgenda) {
        super( "Impossible d'ajouter une tache dont la deadline ("+deadline+") est avant la date de l'agenda ("+dateAgenda+")" );
        this.deadline = deadline;
        this.dateAgenda = dateAgenda;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public LocalDate getDateAgenda() {
        return dateAgenda;
    }


}
