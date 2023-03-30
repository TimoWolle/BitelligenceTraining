package punkt;

public class PointUtils {

    //Addiert 3 Vectoren zu einem
    public static Vector addPoints(Vector v1, Vector v2, Vector v3){
        return new Vector(v1.pointX + v2.pointX + v3.pointX,v1.pointY + v2.pointY + v3.pointY, v1.pointZ + v2.pointZ + v3.pointZ);
    }

    //macht irgendwas
    public static int scalarProduct(Vector v1, Vector v2) {
        return v1.getPointX() * v2.getPointX() + v1.getPointY() * v2.getPointY() + v1.getPointZ() * v2.getPointZ();
    }

    //Bildet ein Kreuzprudkt aus 3 Vectoren
    public static Vector kreuzProduct(Vector v1, Vector v2){
        int x = v1.pointY * v2.pointZ - v1.pointZ * v2.pointY;
        int y = v1.pointZ * v2.pointX - v1.pointX * v2.pointZ;
        int z = v1.pointX * v2.pointY - v1.pointY * v2.pointX;
        return new Vector(x, y, z);
    }

    //Berechnet die länge der Vectoren
    public static double berechneLänge(Vector v1){
        return Math.sqrt(v1.pointX * v1. pointX + v1.pointY * v1.pointY + v1.pointZ * v1.pointZ);
    }
}
