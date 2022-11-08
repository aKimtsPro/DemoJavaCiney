package be.bstorm.akimts.demo.oo.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Volant> list = new ArrayList<>();

        list.add( new Avion(100) );

        Volant v = list.get(0);

        v.voler( 5 );

    }

}
