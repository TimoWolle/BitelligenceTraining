package aufgabe11_13_15_20.geometrik;
/**
 * Immutable Point class representing a point in 2D space.
 * Provides standard calculation methods.
 */
public class Point {

    private final double x;
    private final double y;

    public Point(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Add the x and y coordinate of two points together and
     * return a new point.
     * @param point - Point consisting of x and y coordinate
     * @return new Point
     */
    public Point add(Point point) {
        double sumX = this.getX() + point.getX();
        double sumY = this.getY() + point.getY();

        return new Point(sumX, sumY);
    }

    /**
     * Subtract the x and y coordinate of the second point from the current point
     * and return a new point.
     * @param point - Point consisting of x and y coordinate
     * @return new Point
     */
    public Point subtract(Point point) {
        double diffX = this.getX() - point.getX();
        double diffY = this.getY() -  point.getY();

        return new Point(diffX, diffY);
    }

    /**
     * Multiply the current point by a scalar (multiplier) and return a new point.
     * @param multiplier - scalar
     * @return new Point
     */
    public Point multiply(double multiplier) {
        double multResultX = this.getX() * multiplier;
        double multResultY = this.getY() * multiplier;

        return new Point(multResultX, multResultY);
    }

    /**
     * Divide the current point by a scalar (divisor) and return a new point.
     * @param divisor - scalar
     * @return new Point
     */
    public Point divide(double divisor) {
        double divResultX = this.getX() / divisor;
        double divResultY = this.getY() / divisor;

        return new Point(divResultX, divResultY);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}