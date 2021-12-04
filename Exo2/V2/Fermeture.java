public class Fermeture extends Etat {

    Fermeture(Porte p) {
        super(p);
    }

    public Etat etatSuivant() {
        return new Fermee(p);
    }

    public void ouvrir() {
        System.out.println("le moteur est en train d'ouvrir la porte. ");
        this.p.etatSuivant();
    }

    public void fermer() {

    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Fermeture");
    }
}
