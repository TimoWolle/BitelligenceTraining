package aufgabe4;
//https://training.bitelligence.net/java/exercise/if-else-if/bmi


import java.text.DecimalFormat;
import java.util.Scanner;

public class Aufgabe4 {

    /**
     * Method to calculate the Body Mass Index.0
     * Formula: weight (kg) / (height (meters) * height (meters))
     *
     * @param heightInCentimeters - height in centimeters
     * @param weightInKilograms   - weight in kilograms
     * @return Body Mass Index
     */
    public enum BMIStatus{
        UNTERGEWICHTIG("Untergewichtig"),
        NORMALGEWICHTIG("Normalgewichtig"),
        ÜBERGEWICHTIG("Übergewichtig"),
        SCHWERES_ÜBERGEWICHT("Schweres Übergewicht"),
        UNGÜLTIG("Bitte geben sie gültige Werte ein.");

        private final String description;

        private BMIStatus(String description) {
            this.description = description;
        }

        public String toString() {
            return description;
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter Height (in CM): ");
        int height = myObj.nextInt();  // Read user input

        System.out.println("\rEnter Weight (in KG): ");  // Output user input1
        int weight = myObj.nextInt();  // Read user input

        System.out.println(getBMItext(calculateBmiOneDecimal(height,weight)));
    }
    public static double calculateBmiOneDecimal(int heightInCentimeters, int weightInKilograms) {

        double bmi = 0;

        if (weightInKilograms > 0 && heightInCentimeters > 0) {
            double heightInMeters = heightInMeters = heightInCentimeters / 100.0;
            bmi = weightInKilograms / (heightInMeters * heightInMeters);
        }

        return Math.round(bmi * 10.0) / 10.0;
    }

    public static String getBMItext(double bmi) {

        if (bmi<=0)
            return BMIStatus.UNGÜLTIG.description;


        switch ((1 <= bmi && bmi <= 18.5 ) ? 0 :
                (18.5 < bmi && bmi <= 25 ) ? 1 :
                (25 < bmi && bmi <= 30 ) ? 2 : 3){

            case 0:
                return bmi + " " + BMIStatus.UNTERGEWICHTIG;
            case 1:
                return bmi + " " + BMIStatus.NORMALGEWICHTIG;
            case 2:
                return bmi + " " + BMIStatus.ÜBERGEWICHTIG;
            case 3:
                return bmi + " " + BMIStatus.SCHWERES_ÜBERGEWICHT;
            default:
                return "";
        }
    }
}