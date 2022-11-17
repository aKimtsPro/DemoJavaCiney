package be.bstorm.akimts.demo.oo.exceptions;

import java.time.LocalDate;

public class Assistant {

    private final Agenda agenda;

    public Assistant(Agenda agenda) {
        this.agenda = agenda;
    }

    public boolean ajouterTache() {
        try {
            agenda.ajouter( new Tache(LocalDate.MIN, "desc") );
            return true;
        }
        catch ( Exception ex ) {
            return false;
        }
    }
}
