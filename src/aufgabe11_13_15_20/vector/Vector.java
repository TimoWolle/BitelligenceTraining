package aufgabe11_13_15_20.vector;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Vector {
    public int pointX = 0;
    public int pointY = 0;
    public int pointZ = 0;

    //Constructor
    public Vector(int i, int i1) {
        this.pointX = i;
        this.pointY = i1;
    }

    public void addiere(int _point, boolean _isX){
        if (_isX){
            this.pointX =+ _point;
        }else{
            this.pointY =+ _point;
        }
    }
    public void subtrahiere(int _point, boolean _isX){
        if (_isX){
            this.pointX =- _point;
        }else{
            this.pointY =- _point;
        }
    }
    public void multipliziere(int _point, boolean _isX){
        if (_isX){
            this.pointX = this.pointX * _point;
        }else{
            this.pointY = this.pointY * _point;
        }
    }
    public void dividiere(int _point, boolean _isX){
        if (_isX){
            this.pointX = this.pointX / _point;
        }else{
            this.pointY = this.pointY / _point;
        }
    }

    public String toString() {
        return "Punkt{" +
                "Point X=" + pointX +
                ", Point Y=" + pointY +
                ", Point Z=" + pointZ +
                '}';
    }
}
