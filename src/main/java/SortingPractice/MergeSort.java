package SortingPractice;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        //Generate 1,000,000 random integers
        Random r = new Random();
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }

        System.out.printf("Before: %s\n", Arrays.toString(arr));
        mergeSort(arr);
        //System.out.printf("After: %s\n", Arrays.toString(arr));
    }

    static void mergeSort(int[] arr) {
        //Base case
        if (arr.length < 2) {
            return;
        }

        //Get index of middle to split input
        int mid = arr.length / 2;
        //Create both halves
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        //Copy elements into their respective halves
        System.out.printf("Left: ");
        for (int i = 0; i < mid; i++) {
            System.out.printf("%d ", arr[i]);
            left[i] = arr[i];
        }
        System.out.print("\nRight: ");
        for (int i = mid; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
            right[i - mid] = arr[i];
        }
        System.out.println();
    }

    static void merge(int[] arr, int[] left, int[] right) {

    }
}
