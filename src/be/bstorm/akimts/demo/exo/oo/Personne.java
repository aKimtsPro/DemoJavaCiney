package be.bstorm.akimts.demo.exo.oo;

public class Personne {

    private String nom;
    private String prenom;
    private String dateNaissance;
    private int taille = 150;
    private int poid;

    public String getNom(){
        return nom;
    }

    public void setNom( String nom ){
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        if( taille <= 200 ) {
            this.taille = taille;
        }
    }

    public int getPoid() {
        return poid;
    }

    public void setPoid(int poid) {
        this.poid = poid;
    }

    public Personne() {
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, int taille, int poid) {
//        this(nom, prenom);
        this.nom = nom;
        this.prenom = prenom;
        this.setTaille(taille);
        this.poid = poid;
    }

    void sePresenter(){
        System.out.println("Bonjour je suis " + prenom + " " + nom);
    }

    void saluer(Personne autrePersonne){
        System.out.println("Bonjour " + autrePersonne.prenom + " " + autrePersonne.nom + ", je suis " + prenom + " " + nom);
    }

    double calculerIMC(){
        double tailleM = taille / 100.;
        return poid / ( tailleM * tailleM );
    }

    void ajouterAuNom(char ...characters){
        StringBuilder sb = new StringBuilder(this.nom);
        for (char character : characters) {
            sb.append( character );
        }
        this.nom = sb.toString();
    }


}
