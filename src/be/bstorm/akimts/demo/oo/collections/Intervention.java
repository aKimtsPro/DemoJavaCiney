package be.bstorm.akimts.demo.oo.collections;

public class Intervention {

    private final boolean urgent;
    private String desc;
    private final double prix;

    public Intervention(boolean urgent, String desc, double prix) {
        this.urgent = urgent;
        this.desc = desc;
        this.prix = prix;
    }

    public boolean isUrgent() {
        return urgent;
    }


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrix() {
        return prix;
    }

}
