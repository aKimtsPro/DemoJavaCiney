package be.bstorm.akimts.demo.oo.collections;

import java.util.Deque;
import java.util.LinkedList;

public class Garage {

    private Deque<Intervention> interventions = new LinkedList<>();


    public void ajouter(Intervention toAdd){

        if (toAdd != null)
            throw new IllegalArgumentException("toAdd cannot be null");

        if( toAdd.isUrgent() )
            interventions.addFirst( toAdd );
        else
            interventions.addLast( toAdd );

    }


    public Intervention travailler(){
//        return interventions.removeFirst();
        return interventions.pop();
    }

}
