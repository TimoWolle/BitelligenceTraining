package aufgabe11_13_15_20.geometrik;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Rechteck extends AGeometrischesObekt{
    private Point topLeft,topRight,bottomLeft,bottomRight;

    @Override
    public double getFlächeninhalt() {
        return Math.abs(topLeft.getX()- topRight.getX())*Math.abs(topLeft.getY()- bottomRight.getY()
        );
    }

    @Override
    public double getUmfang() {
        return (Math.abs(topLeft.getX()- topRight.getX())+Math.abs(topLeft.getY()- bottomRight.getY()))*2;
    }
}
