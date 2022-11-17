package be.bstorm.akimts.demo.oo.exceptions;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Tache> aFaire = new ArrayList<>();
    private LocalDate today;

    public Agenda(LocalDate today) {
        this.today = today;
    }

    /**
     * @param tache, doit pas être null
     * @throws Exception, tache est nul ou si elle a déjà été ajoutée
     *                      ou si sa deadline est < today
     */
    public void ajouter( Tache tache ) {
        // Quid si tache null
        if( tache == null )
            throw new IllegalArgumentException( "tache ne doit pas être null" );

        // Quid si tache déjà présente
        if( aFaire.contains( tache ) )
            throw  new TacheAlreadyAddedException();

        // Quid si j'ajoute une tache à faire dans le passé
        if( tache.getDeadline().isBefore( today ) )
            throw new PastTacheDeadlineException(tache.getDeadline(), today);

        aFaire.add(tache);
    }


}
