package kassenbon;

import java.util.Comparator;

public class EinkaufswagenSortingComperator implements Comparator<Einkaufswagen> {

    @Override
    public int compare(Einkaufswagen o1, Einkaufswagen o2) {
        return Integer.compare(o1.getEssen().getNr(), o2.getEssen().getNr());
    }
}
