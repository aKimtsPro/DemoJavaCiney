package be.bstorm.akimts.demo;

import java.util.*;

public class DemoCollection {

    public static void main(String[] args) {


        // Les collections

//        List<String> liste = new ArrayList<>();
//        liste.add( "bonjour" );
//        liste.add("bon midi");
//        liste.add("bonsoir");
//
//        liste.set( 2, "bonne nuit" );
//
//        liste.remove( 1 );
//
//        System.out.println( liste.get( 1 ) ); // ?
//
//        boolean removed = liste.remove("coucou");
//        System.out.println( removed ? "supprimé" : "absent" );
//
//
//        for (int i = 0; i < liste.size(); i++) {
//            System.out.println( liste.get(i) );
//        }
//
//
//        Set<String> set = new HashSet<>();
//
//        set.add("ok");
//        set.add("ok");
//
//        for (String s : set) {
//            System.out.println(s);
//        }


        Map< String, Integer > pointMath = new HashMap< String, Integer >();

        pointMath.put( "luc", 15 );
        pointMath.put( "marie", 14 );
        pointMath.put( "dominique", 8 );

        System.out.println( pointMath.get( "marie" ) ); // 14

        pointMath.put( "luc", 2 );

        for (String key : pointMath.keySet()) {
            System.out.println( key );
            System.out.println( pointMath.get( key ) );
        }






    }

}
