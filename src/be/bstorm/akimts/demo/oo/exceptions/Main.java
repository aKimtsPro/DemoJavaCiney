package be.bstorm.akimts.demo.oo.exceptions;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Agenda agenda = new Agenda(LocalDate.now());

        try{
            Tache aAjouter = new Tache(LocalDate.MIN, "desc");
            agenda.ajouter( aAjouter );
//            agenda.ajouter( aAjouter );
        }
        catch (PastTacheDeadlineException ex){
            System.out.println( "deadline problem: " + ex.getMessage());
            System.out.println("deadline: " + ex.getDeadline());
            System.out.println("agenda date: " + ex.getDateAgenda());
        }
        catch (RuntimeException ex){
            System.out.println( ex.getMessage() );
        }

    }

}
