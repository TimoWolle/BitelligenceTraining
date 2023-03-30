package aufgabe11_13_15_20.person;

import copy.DeepCopy;
import copy.ShallowCopy;
import csv.CSVParser;
import person.Address;
import person.Person;

import java.io.FileNotFoundException;

public class MainPerson {
    public static void main(String[] args) throws IllegalAccessException, FileNotFoundException {
        CSVParser personParser = new CSVParser();

        Person p1 = new Person(23, "Timo", "Paulus", 110, 170, new Address("Silberberg", "Leonberg"));

        System.out.println("ShallowCopy: " + DeepCopy.copyDeep(p1, 3));

        System.out.println("ShallowCopy: " + ShallowCopy.copyShellow(p1, 3));

        personParser.writeFile(p1);
    }
}