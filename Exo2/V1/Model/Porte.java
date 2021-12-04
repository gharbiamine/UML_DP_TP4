public class Porte {
    Porte() {
        super();
        this.etat = new Fermee(this);
    }

    public Etat etat;

    public void etatSuivant() {
        this.etat = etat.etatSuivant();
        System.out.println("L'etat de la porte est : " + this.etat.toString());

    }

    public void ouvrir() {
        this.etat.ouvrir();
    }

    public void fermer() {
        this.etat.fermer();
    }

    public static void main(String[] args) {
        Porte porte = new Porte();
        porte.ouvrir();
        porte.ouvrir();
        porte.fermer();
        porte.fermer();
        porte.fermer();
        porte.ouvrir();
        porte.ouvrir();

    }

}