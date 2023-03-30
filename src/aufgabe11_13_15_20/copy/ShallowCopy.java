package aufgabe11_13_15_20.copy;

import java.util.ArrayList;
import java.util.List;
    /*
    Eine Shallow Copy (flache Kopie) erstellt eine neue Instanz eines Objekts,
    aber die neuen Instanzen teilen sich immer noch dieselben Referenzen zu den
    enthaltenen Objekten. Wenn also Änderungen an einem Objekt vorgenommen werden,
    das von beiden Instanzen referenziert wird, wirken sich diese Änderungen auf beide Instanzen aus.
     */


public class ShallowCopy{

    public static <T> List<T> copyShellow(T _objektToCopy, int _quantity){

        List<T> returnList = new ArrayList<>();

        for(int i = 1; i <= _quantity; i++ ){
            returnList.add(_objektToCopy);
        }
        return returnList;
    }
}
