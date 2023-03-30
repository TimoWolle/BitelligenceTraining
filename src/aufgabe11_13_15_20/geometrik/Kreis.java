package aufgabe11_13_15_20.geometrik;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//Mittelpunkt

public class Kreis extends AGeometrischesObekt{
    private double radius;
    private Point center;
    private Point outside;

    @Override
    public double getFlächeninhalt() {
        return Math.PI*(radius*radius);
    }

    @Override
    public double getUmfang() {
        return 2*Math.PI*radius;
    }
}
