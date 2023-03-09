package kassenbon;

import javax.swing.*;
import java.util.*;

public class Kassenbon {

    public static List<Einkaufswagen> einkaufswagenList = new ArrayList<>();

    public static void main(String[] args) {
        showSortiment();
        selectSortiment();
    }

    public static void showSortiment(){
        System.out.printf("%-5s %-13s %-13s%n", "NR.", "Beschreibung", "Preis/Einheit");
        System.out.println("------------------------------------");

        for(Lebensmittel l : Lebensmittel.values()){
            System.out.printf("%-5s %-13s %-13s%n", l.getNr() + ": ", l.getBeschreibung() , l.getPrice() + "\u20ac/" + l.getEinheit());
        }

        System.out.println("\n------------------------------------");
    }

    public static void showEinkaufswagen(){

        System.out.printf("\nEinkaufswagen\n%-5s %-13s %-8s %-10s %-7s%n", "NR.", "Beschreibung", "Preis", "Anzahl", "Total");
        System.out.println("---------------------------------------------");

        double tot = 0.00;
        for(Einkaufswagen e : einkaufswagenList){
            tot += e.getPrice();
            System.out.printf("%-5s %-13s %-8s %-10s %-7s%n", e.getEssen().getNr() + ": ", e.getEssen().getBeschreibung() , e.getEssen().getPrice() + "\u20AC", e.getAnzahl() + " " + e.getEssen().getEinheit(), e.getPrice()+ "\u20AC");
        }

        tot = Math.round(tot * 100.0) / 100.0;

        System.out.printf("%-5s %-13s %-8s %-10s %-7s%n", "","","","","------");
        System.out.printf("%-5s %-13s %-8s %-10s %-7s%n", "","","","",tot+ "\u20AC\n");


        System.out.println("---------------------------------------------\n");
    }

    public static void selectSortiment(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen! Gib '" + "\u001B[31mexit\u001B[0m" + "' ein, um das Programm zu beenden.");
        System.out.println("Oder geben sie '" + "\u001B[32mEinkaufswagen\u001B[0m" + "'" +  " oder " + "'" + "\u001B[32mE\u001B[0m" + "' ein um ihn anzuzeigen.\n");

        String input = "";
        while (!input.equals("exit")) {
            System.out.print("Welches Produkt wollen Sie kaufen, bitte NR. angeben: ");
            input = scanner.nextLine();

            if (input.equals("Einkaufswagen") || input.equals("E")) {
                showEinkaufswagen();
                continue;
            }

            if (input.equals("")) {
                System.out.println("Produktnummer nicht gefunden.");
                continue;
            }

            Lebensmittel essen = Lebensmittel.getEssenByNr(Integer.parseInt(input));

            System.out.print("Wie viel " + essen.getEinheit() + " " + essen.getBeschreibung() + " möchtest du kaufen: ");
            input = scanner.nextLine();

            Kassenbon.einkaufswagenList.add(new Einkaufswagen(Double.parseDouble(input), essen));

            
            //SortingComp ist nach Shema:
            Collections.sort(Kassenbon.einkaufswagenList, new EinkaufswagenSortingComperator());

            System.out.println("Du hast '" + input + " " + essen.getEinheit() + "' in den Einkaufswagen gelegt.\n");

            essen = null;
        }

    }

}
