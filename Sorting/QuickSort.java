package com.company.Sorting;

public class QuickSort {

   public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static int partition(int[] arr, int start, int end) {

        int pivot = arr[end];
        int i = (start - 1);

        for(int j = start; j <= end - 1; j++) {

            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, end);
        return (i + 1);
    }

   public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end);

            quickSort(arr, start, pi - 1);
            quickSort(arr, pi + 1, end);
        }
    }


   public static void printArray(int[] arr, int size) {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }


    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        System.out.println("Given array: ");
        printArray(arr,n);
        System.out.println();

        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
