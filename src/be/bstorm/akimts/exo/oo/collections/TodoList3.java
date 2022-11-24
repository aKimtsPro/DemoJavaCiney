package be.bstorm.akimts.exo.oo.collections;

import java.util.LinkedList;

public class TodoList3 {

    private final LinkedList<Tache> taches = new LinkedList<>();
    private int nbrCodeRouge = 0;

    public void ajouter(Tache tache){

        if( tache == null )
            throw new IllegalArgumentException();

        switch (tache.getPriorite()){
            case ATTENTION -> taches.add(nbrCodeRouge, tache);
            case TRANQUILLE -> taches.addLast(tache);
            case CODE_ROUGE -> {
                taches.addFirst(tache);
                nbrCodeRouge++;
            }

        }

    }

    public Tache checkNext(){
        return taches.peekFirst();
    }

    public Tache executeNext(){
        Tache tache = taches.pop();

        if( tache.getPriorite() == Priorite.CODE_ROUGE )
            nbrCodeRouge--;

        return tache;
    }

}
