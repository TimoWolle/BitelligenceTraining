package punkt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointUtilsTest {

    @Test
    public void testAddPoints() {
        Vector v1 = new Vector(1,2,3);
        Vector v2 = new Vector(4,5,6);
        Vector v3 = new Vector(7,8,9);
        Vector result = PointUtils.addPoints(v1, v2, v3);
        assertEquals(12, result.getPointX());
        assertEquals(15, result.getPointY());
        assertEquals(18, result.getPointZ());
    }

    @Test
    public void testScalarProduct() {
        Vector v1 = new Vector(1,2,3);
        Vector v2 = new Vector(4,5,6);
        int result = PointUtils.scalarProduct(v1, v2);
        assertEquals(32, result);
    }

    @Test
    public void testKreuzProduct() {
        Vector v1 = new Vector(1,2,3);
        Vector v2 = new Vector(4,5,6);
        Vector result = PointUtils.kreuzProduct(v1, v2);
        assertEquals(-3, result.getPointX());
        assertEquals(6, result.getPointY());
        assertEquals(-3, result.getPointZ());
    }

    @Test
    public void testBerechneLänge() {
        Vector v1 = new Vector(3,4,5);
        double result = PointUtils.berechneLänge(v1);
        assertEquals(7.0710678118654755, result);
    }
}