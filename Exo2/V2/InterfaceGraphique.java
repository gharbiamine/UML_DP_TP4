public class InterfaceGraphique implements Observer {

    Porte porte;

    InterfaceGraphique(Porte p) {
        this.porte = p;
    }

    public void actualiser() {
        System.out.println("L'etat de la porte est : " + porte.etat.toString());
    }

}
    