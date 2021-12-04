
import java.util.*;

/**
 * 
 */
public abstract class ZoneTouristique {

    public ZoneTouristique() {
    }

    public void accepter(Visiteur v) {
        v.VisiterZone(this);
    }

}