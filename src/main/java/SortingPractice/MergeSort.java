package SortingPractice;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        //Generate 1,000,000 random integers
        Random r = new Random();
        int[] arr = new int[100000000];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100000000);
        }

        //System.out.printf("Before: %s\n", Arrays.toString(arr));
        long start = System.currentTimeMillis();
        mergeSort(arr);
        long end = System.currentTimeMillis();
        //System.out.printf("After: %s\n", Arrays.toString(arr));
        System.out.printf("Time: %d\n", end - start);
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
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        //Merge Sort both halves
        mergeSort(right);
        mergeSort(left);
        //Merge 2 halves
        merge(arr, left, right);
    }

    static void merge(int[] arr, int[] left, int[] right) {
        int rightIndex = 0;
        int leftIndex = 0;
        int arrIndex = 0; //Tracks input array position

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                arr[arrIndex] = left[leftIndex];
                leftIndex++;
            } else {
                arr[arrIndex] = right[rightIndex];
                rightIndex++;
            }
            arrIndex++;
        }

        while (leftIndex < left.length) {
            arr[arrIndex] = left[leftIndex];
            arrIndex++;
            leftIndex++;
        }

        while (rightIndex < right.length) {
            arr[arrIndex] = right[rightIndex];
            arrIndex++;
            rightIndex++;
        }
    }
}
