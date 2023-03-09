package aufgabe5;
import java.util.Random;
import java.util.Scanner;

public class Aufgabe5 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int zahl = rand.nextInt(100) + 1;
        System.out.println("Rate: Welche Zahl wird gesucht (1-100)?");

        int input = scanner.nextInt();

        while (input != zahl) {
            System.out.println("Leider falsch!\nBitte gebe erneut eine Zahl ein:");

            if (input > zahl) {
                System.out.println("Tipp: Die gesuchte Zahl ist kleiner.");
            } else {
                System.out.println("Tipp: Die gesuchte Zahl ist größer.");
            }

            input = scanner.nextInt();
        }

        System.out.println("Gewonnen");

    }
}
