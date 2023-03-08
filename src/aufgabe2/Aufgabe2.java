package aufgabe2;

public class Aufgabe2 {

    public static void main(String[] args){
        int i = 0;
        int j = 0;
        int k = 0;

        // Snippet 1
        if (i > 0 || j > 5) {
            k = 10;
        }

        // Snippet 2
        if (i > 0 && j > 5) {
            k = 10;
        }

        // Snippet 3
        if ((i > 0 && j > 5) || k < 15) {
            k = 10;
        }

        // Snippet 4
        if ((i > 0 || j > 5) && k > 15) {
            k = 10;
        }

        // Snippet 5
        if (i == 0 & j++ < 5) {
            k = 10;
        }

        // Snippet 6
        if (i == 0 && j++ < 5) {
            k = 10;
        }

        // Snippet 7
        if (i != 0 && j++ < 5) {
            k = 10;
        }

        // Snippet 8
        if (i != 0 & j++ < 5) {
            k = 10;
        }
    }
}
