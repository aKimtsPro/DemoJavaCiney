package be.bstorm.akimts.exo.oo.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class TodoList2 {

    private final Queue<Tache> taches = new PriorityQueue<>( Tache::compareTo );

    public void add(Tache tache){
        if (tache == null)
            throw new IllegalArgumentException();

        taches.add( tache );
    }

    public Tache executeNext(){
        return taches.poll();
    }

    public Tache checkNext(){
        return taches.peek();
    }

}
