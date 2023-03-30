package aufgabe11_13_15_20.person;

import csv.CSVEntity;
import csv.CSVField;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@CSVEntity

public class Person implements Cloneable, Comparable {
    @CSVField
    public Integer age;
    @CSVField
    public String vname;
    @CSVField
    public String nname;
    @CSVField
    public Integer height;
    @CSVField
    public Integer weight;
    @CSVField
    public Address address;

    @Override
    public Person clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = this.address.clone();
        return cloned;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

