package aufgabe4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Aufgabe4Test {

    @Test
    public void shouldBeGiveBmi(){
        String expected1 = "52.6 Schweres Übergewicht";
        String expected2 = "Bitte geben sie gültige Werte ein.";
        String expected3 = "19.1 Normalgewichtig";

        int cm1 = 190;
        int cm2 = 0;
        int cm3 = 150;

        int kg1 = 190;
        int kg2 = -70;
        int kg3 = 43;

        assertEquals(expected1, Aufgabe4.getBMItext(Aufgabe4.calculateBmiOneDecimal(cm1,kg1)));
        assertEquals(expected2, Aufgabe4.getBMItext(Aufgabe4.calculateBmiOneDecimal(cm2,kg2)));
        assertEquals(expected3, Aufgabe4.getBMItext(Aufgabe4.calculateBmiOneDecimal(cm3,kg3)));
    }
}