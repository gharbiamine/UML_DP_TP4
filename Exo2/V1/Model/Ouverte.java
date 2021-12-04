public class Ouverte extends Etat {

    Ouverte(Porte p) {
        super(p);
    }

    public Etat etatSuivant() {
        return new Fermeture(p);
    }

    public void ouvrir() {
        
    }

    public void fermer() {
        System.out.println("la porte est en fermeture. ");
        this.p.etatSuivant();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Ouverte");
    }

}
