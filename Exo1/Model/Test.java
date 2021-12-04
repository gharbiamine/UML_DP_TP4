public class Test {
    public static void main(String[] args) {
        Musee m = new Musee();
        Parc p = new Parc();
        Ville v = new Ville();
        Visiteur va = new VisiteurAcheter();
        Visiteur vv = new VisiteurVisiter();
        v.accepter(va);
        v.accepter(vv);
        p.accepter(va);
        m.accepter(vv);
    }
}
