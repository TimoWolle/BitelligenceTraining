package aufgabe11_13_15_20.geometrik;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Dreieck extends AGeometrischesObekt{
    //private Point ab, bc, ac;
    //left.getX()- right.getX() -> ab
    //(left.getX()- top.getX())²+(left.getY()-top.getY())²= -> WURTZEL ac
    //(right.getX()- top.getX())²+(right.getY()-top.getY())²= -> WURTZEL bc
    private Point left, top, right;


    @Override
    public double getFlächeninhalt() {
        double s = getUmfang() / 2.0;
        double ab = getAB();
        double bc = getBC();
        double ac = getAC();

        return Math.sqrt(s * (s - ab) * (s - ac) * (s - bc));
    }

    @Override
    public double getUmfang() {
        double ab = getAB();
        double bc = getBC();
        double ac = getAC();

        return ab+ac+bc;
    }

    public double getAB(){
        return left.getX()- right.getX();
    }

    public double getBC(){
        return Math.sqrt(Math.pow(left.getX()- top.getX(),2)+Math.pow(left.getY()-top.getY(),2));
    }

    public double getAC(){
        return Math.sqrt(Math.pow(right.getX()- top.getX(),2)+Math.pow(right.getY()-top.getY(),2));
    }
}
