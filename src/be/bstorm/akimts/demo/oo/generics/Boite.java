package be.bstorm.akimts.demo.oo.generics;

public class Boite<C> {

    private C contenu;

    public Boite() {
    }

    public void setContenu(C contenu){
        this.contenu = contenu;
    }

    public C getContenu() {
        return contenu;
    }

    public static <T> Boite<T> enrober(T contenu){
        Boite<T> boite = new Boite<>();
        boite.setContenu(contenu);
        return boite;
    }

}
