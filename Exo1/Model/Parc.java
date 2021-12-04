
public class Parc extends ZoneTouristique {

    public Parc() {
    }

    public void accepter(Visiteur v) {
        System.out.println("le parc a accepte votre visite :)");
        v.VisiterParc(this);
    }

}