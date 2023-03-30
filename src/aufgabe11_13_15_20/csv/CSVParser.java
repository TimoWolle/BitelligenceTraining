package aufgabe11_13_15_20.csv;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVParser {
    public <T> boolean isObjParsable(T _object) {
        return _object.getClass().getAnnotation(CSVEntity.class) != null;
    }

    public <T> void writeFile(T _obj) throws FileNotFoundException {

        Map<Field, Object> _fields = getFieldStrings(_obj);

        String filePath = "Person.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            String line = "HEADER";
            writer.write(line);
            for (Map.Entry<Field, Object> entry : _fields.entrySet()) {

                Field f = entry.getKey();
                Object o = entry.getValue();

                line = (", " + f.get(o).toString());

                writer.write(line);
            }

            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> Map<Field, Object> getFieldStrings(T _object) {

        Map<Field, Object> fields = new HashMap<>();

        try {
            for (Field f : _object.getClass().getDeclaredFields()) {
                f.setAccessible(true);

                if (f.getAnnotation(CSVField.class) != null) {
                    if (isObjParsable(f.get(_object))) {
                        fields.putAll(getFieldStrings(f.get(_object)));
                    } else {
                        fields.put(f, _object);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            System.out.printf(String.valueOf(e));
        }
        return fields;
    }
}