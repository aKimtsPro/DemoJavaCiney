package be.bstorm.akimts.exo.oo.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class TodoList {

    private final LinkedList<Tache> taches = new LinkedList<>();

    public void ajouter(Tache tache){

        if( tache == null )
            throw new IllegalArgumentException();

        switch (tache.getPriorite()){
            case ATTENTION -> {
                int nbrCodeRouge = 0;
                Iterator<Tache> tacheIterator = taches.iterator();
                while ( tacheIterator.hasNext() && tacheIterator.next().getPriorite().isGreaterThan(Priorite.ATTENTION) ){
                    nbrCodeRouge++;
                }
                taches.add(nbrCodeRouge, tache);
            }
            case TRANQUILLE -> taches.addLast(tache);
            case CODE_ROUGE -> taches.addFirst(tache);
        }

    }

    public Tache checkNext(){
        return taches.peekFirst();
    }

    public Tache executeNext(){
        return taches.pop();
    }


}
