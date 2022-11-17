package be.bstorm.akimts.exo.oo.generics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Competition<S extends Sportif> {

    private final Map<S, Double> inscrits = new HashMap<>();
    private Podium<S> podium;

    public boolean isLaunched(){
        return podium != null;
    }

    public void signedUp(S aInscrire ){

        if( aInscrire == null )
            throw new IllegalArgumentException();

        if( inscrits.containsKey( aInscrire ) )
            throw new AlreadySignedUpException();

        if( isLaunched() )
            throw new AlreadyLaunchedException();

        inscrits.put( aInscrire, null );

    }

    public void cancel(S sportif ){

        if( sportif == null )
            throw new IllegalArgumentException();

        if( !inscrits.containsKey( sportif ) )
            throw new AbsentException();

        if( isLaunched() )
            throw new AlreadyLaunchedException();

        inscrits.remove( sportif );

    }


    public Podium<S> launch(){

        if( isLaunched() )
            throw new AlreadyLaunchedException();

        if( inscrits.size() < 3 )
            throw new InsufficientParticipantsException();

        for (S sportif : inscrits.keySet()) {
            inscrits.put( sportif, sportif.performer() );
        }

         List<S> list = inscrits.entrySet().stream()
                .sorted( (a, b) -> Double.compare(inscrits.get(b.getValue()), inscrits.get(a.getValue())) )
                .limit(3)
                 .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return podium = new Podium<>( list.get(0), list.get(1),list.get(2));
    }



}
