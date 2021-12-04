
import java.util.*;

/**
 * 
 */
public class VisiteurVisiter extends Visiteur {

    public VisiteurVisiter() {
    }

    public void VisiterParc(Parc p) {
        System.out.println("Je visite pour la premiere fois le parc !");
    }

    public void VisiterMusee(Musee m) {
        System.out.println("Je visite pour la premiere fois le musee !");
    }

    public void VisiterVille(Ville v) {
        System.out.println("Je visite pour la premiere fois la ville !");
    }

    public void VisiterZone(ZoneTouristique z) {
        System.out.println("Je visite pour la premiere fois la zone !");
    }

}