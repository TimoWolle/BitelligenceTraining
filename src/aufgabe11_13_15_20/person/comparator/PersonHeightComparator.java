package aufgabe11_13_15_20.person.comparator;

import person.Person;

import java.util.Comparator;

public class PersonHeightComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        // Wenn die Personen das gleiche Alter haben, Vergleich nach Größe
        return p1.getHeight().compareTo(p2.getHeight());
    }
}