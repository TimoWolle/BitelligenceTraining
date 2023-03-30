package aufgabe11_13_15_20.person;

import csv.CSVEntity;
import csv.CSVField;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@CSVEntity
@ToString

public class Address implements Cloneable {
   @CSVField
   private String street;
   @CSVField
   private String city;

    @Override
    public Address clone() throws CloneNotSupportedException {
        Address cloned = (Address) super.clone();
        cloned.street = new String(this.street);
        cloned.city = new String(this.city);
        return cloned;
    }

}
