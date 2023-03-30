package aufgabe11_13_15_20.person.comparator;

import person.Person;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        // Vergleich nach Alter
        return p1.getAge().compareTo(p2.getAge());
    }
}