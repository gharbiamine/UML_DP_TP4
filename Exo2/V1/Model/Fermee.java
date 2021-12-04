public class Fermee extends Etat {

    Fermee(Porte p) {
        super(p);
    }

    public Etat etatSuivant() {
        return new Ouverture(p);
    }

    public void ouvrir() {
        System.out.println("la porte est en ouverture ");
        this.p.etatSuivant();
    }

    public void fermer() {
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Fermee");
    }
}
