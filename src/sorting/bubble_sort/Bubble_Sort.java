package sorting.bubble_sort;

import java.util.Arrays;

public class Bubble_Sort {

    /**
     * This method sorts an array of integers using the bubble sort algorithm.
     * The input is an array of integers to be sorted, and the output is the sorted array.
     * The bubble sort algorithm repeatedly steps through the list to be sorted,
     * compares each pair of adjacent items and swaps them if they are in the wrong order.
     * The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted.
     *
     //* @param numbers The array of integers to be sorted
     * @return The sorted array of integers
     */

    public static int[] sort(int[] numbers) {


        for (int i = 0; i<numbers.length; i++) {

            for (int count = 1; count < numbers.length; count++) {
                // Zahlen switchen wenn die Aktuelle Zahl kleiner ist als die Vergleichszahl
                if (numbers[count-1] > numbers[count]) {
                    int tmp = numbers[count -1];
                    numbers[count - 1] = numbers[count];
                    numbers[count] = tmp;

                }

            }
        }
        return numbers;
    }

}
