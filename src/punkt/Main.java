package punkt;

public class Main extends Coordinatensyste {
    public static void main(String[] args) {

        //Vectorerstellung
        Vector p = new Vector();

        //Erstellung des Coordinatensystems mit aufruf er GUI
        Coordinatensyste cs = new Coordinatensyste();
        cs.CoordinateSystem();
        cs.setPoint(p);

        //Pre Set der Punkte
        p.addiere(20, true);
        p.addiere(15, false);
        cs.setPoint(p);
    }
}
