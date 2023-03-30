package aufgabe11_13_15_20.copy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

    /*
    Eine Deep Copy (tiefe Kopie) erstellt eine völlig neue Kopie eines Objekts und
    aller enthaltenen Objekte. Wenn Änderungen an einem Objekt vorgenommen werden,
    das in einer Deep Copy enthalten ist, haben diese Änderungen keine Auswirkungen
    auf das ursprüngliche Objekt oder auf andere Kopien.
     */

public class DeepCopy {

    public static <T extends Cloneable> List<T> copyDeep(T _objektToCopy, int count) {
        List<T> list = new ArrayList<>();

        try{
            Method clone = _objektToCopy.getClass().getMethod("clone");
            for (int i = 0; i < count; i++) {
                T copy = (T) clone.invoke(_objektToCopy);
                list.add(copy);
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return list;
    }
}
