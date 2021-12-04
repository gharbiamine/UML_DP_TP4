
import java.util.*;

public class Ville extends ZoneTouristique {

    public ZoneTouristique z;

    public Ville() {
    }

    public Ville(ZoneTouristique z) {
        this.z = z;
    }

    public void accepter(Visiteur v) {
        System.out.println("la ville a accepte votre visite :)");
        v.VisiterVille(this);
        if (this.z != null) {
            z.accepter(v);
        }
    }

}