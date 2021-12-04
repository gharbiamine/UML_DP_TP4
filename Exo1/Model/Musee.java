
import java.util.*;

/**
 * 
 */
public class Musee extends ZoneTouristique {

    /**
     * Default constructor
     */
    public Musee() {
    }

    public void accepter(Visiteur v) {
        System.out.println("le musee a accepte votre visite :)");
        v.VisiterMusee(this);
    }

}