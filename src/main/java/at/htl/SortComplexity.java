package at.htl;

import java.util.Scanner;

public class SortComplexity {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int anzahlDerArrays;
        int length;
        int counter = 1;
        int time = 0;
        int[] durchschnittzeit = new int[counter];

        System.out.print("Anzahl der zu sortierenden Arrays: ");
        anzahlDerArrays = scanner.nextInt();

        System.out.print("Größe der Arrays: ");
        length = scanner.nextInt();

        for (int i = 0; i < anzahlDerArrays; i++) {
            sortRandomArray(length);
            System.out.println("Laufzeit zur Sortierung des " + counter + ". Arrays: " + time + " ms");
            durchschnittzeit[i] = time;
            counter++;
        }

        System.out.println("Durchschnittliche Laufzeit: " + durchschnittzeit + " ms");

    }

    // Sorts an array of random numbers and returns the sorting run time in ms
    public static long sortRandomArray(int length) {

        int[] rndArray = new int[length];

        long vor = System.currentTimeMillis();

        sort(rndArray);

        long nach = System.currentTimeMillis();

        return nach - vor;
    }

    // Returns an array of random numbers
    public static int[] generateRandomArray(int length) {

        int[] rndArray = new int[length];

        for (int i = 0; i < rndArray.length; i++) {
            rndArray[i] = (int) Math.random() * 100;
        }

        return rndArray;
    }

    // Sorts an array of numbers in ascending order
    public static void sort(int[] array) {

        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                swap()
            }
            array[j + 1] = key;

        }

    // Swaps the array elements with index i and j
    public static void swap(int[] array, int i, int j) {
        int help = array[i];
        array[i] = array[j];
        array[j] = help;
    }

    }
}