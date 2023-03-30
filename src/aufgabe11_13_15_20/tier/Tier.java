package aufgabe11_13_15_20.tier;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Tier {
    private String Name;
    private Integer Alter;
    private Double Gewicht;
    private Integer AnzahlBeine;
    private Boolean Fabelwesen;

    // region FilterWithFor
    public static List<Tier> FilterTwoLegs(List<Tier> tierliste){

        List <Tier> filterdlist = new ArrayList<>();

        for (Tier t : tierliste) {
            if (t.getAnzahlBeine().equals(2)) filterdlist.add(t);
        }

        return filterdlist;
    }

    public static List<Tier> FilterAgeOverTen(List<Tier> tierliste){

        List <Tier> filterdlist = new ArrayList<>();

        for (Tier t : tierliste) {
            if (t.getAlter()>10) filterdlist.add(t);
        }

        return filterdlist;
    }

    public static List<Tier> FilterAgeBetweenFiveEight(List<Tier> tierliste){

        List <Tier> filterdlist = new ArrayList<>();

        for (Tier t : tierliste) {
            if (t.getAlter() <= 8 && t.getAlter() >= 5) filterdlist.add(t);
        }

        return filterdlist;
    }

    public static List<Tier> FilterWeightOver30AgeUnder20(List<Tier> tierliste){

        List <Tier> filterdlist = new ArrayList<>();

        for (Tier t : tierliste) {
            if (t.getGewicht()>30 && t.getAlter()<20) filterdlist.add(t);
        }

        return filterdlist;
    }

    public static List<Tier> FilterFourLegsUnevenAge(List<Tier> tierliste){

        List <Tier> filterdlist = new ArrayList<>();

        for (Tier t : tierliste) {
            if (t.getAnzahlBeine().equals(4) && (t.getAlter() % 2 == 1)) filterdlist.add(t);
        }

        return filterdlist;
    }

    // endregion

    // region FilterWithStream
    public static List<Tier> StreamFilterTwoLegs(List<Tier> tierliste){

        List <Tier> filterdlist = new ArrayList<>();

        filterdlist = tierliste.stream()
                                .filter(tier -> tier.getAnzahlBeine().equals(2))
                                .toList();

        return filterdlist;
    }

    public static List<Tier> StreamFilterAgeOverTen(List<Tier> tierliste){

        List <Tier> filterdlist = new ArrayList<>();

        filterdlist = tierliste.stream()
                .filter(tier -> tier.getAlter()>10)
                .toList();

        return filterdlist;
    }

    public static List<Tier> StreamFilterAgeBetweenFiveEight(List<Tier> tierliste){

        List <Tier> filterdlist = new ArrayList<>();

        filterdlist = tierliste.stream()
                .filter(tier -> tier.getAlter() <= 8 && tier.getAlter() >= 5)
                .toList();

        return filterdlist;
    }

    public static List<Tier> StreamFilterWeightOver30AgeUnder20(List<Tier> tierliste){

        List <Tier> filterdlist = new ArrayList<>();

        filterdlist = tierliste.stream()
                .filter(tier -> tier.getGewicht()>30 && tier.getAlter()<20)
                .toList();

        return filterdlist;
    }

    public static List<Tier> StreamFilterFourLegsUnevenAge(List<Tier> tierliste){

        List <Tier> filterdlist = new ArrayList<>();

        filterdlist = tierliste.stream()
                .filter(tier -> tier.getAnzahlBeine().equals(4) && (tier.getAlter() % 2 == 1))
                .toList();

        return filterdlist;
    }

    // endregion

}
