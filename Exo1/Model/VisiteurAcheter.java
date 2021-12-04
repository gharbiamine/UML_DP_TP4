
import java.util.*;

public class VisiteurAcheter extends Visiteur {

    /**
     * Default constructor
     */
    public VisiteurAcheter() {
    }

    /**
     * 
     */
    public void VisiterParc(Parc p) {
        System.out.println("J'achete un souvenir du parc !");
    }

    /**
     * 
     */
    public void VisiterMusee(Musee m) {
        System.out.println("J'achete un souvenir du musee !");
    }

    /**
     * 
     */
    public void VisiterVille(Ville v) {
        System.out.println("J'achete un souvenir de la ville !");
    }

    public void VisiterZone(ZoneTouristique z) {
        System.out.println("J'achete un souvenir de la zone !");
    }

}