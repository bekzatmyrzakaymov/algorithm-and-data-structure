package com.company.Sorting;

public class MergeSort {

   public void merge(int[] arr, int start, int middle, int end) {

        int n1 = middle - start + 1;
        int n2 = end - middle;

        int[] a = new int[n1];
        int[] b = new int[n2];

        for (int i = 0; i < n1; ++i)
            a[i] = arr[start + i];
        for (int j = 0; j < n2; ++j)
            b[j] = arr[middle + 1 + j];

        int i = 0, j = 0;

        int k = start;
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                arr[k] = a[i];
                i++;
            }
            else {
                arr[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = a[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = b[j];
            j++;
            k++;
        }
    }


   public void sort(int[] arr, int start, int end) {
        if (start < end) {
            int middle = start + (end - start)/2;

            sort(arr, start, middle);
            sort(arr, middle + 1, end);

            merge(arr, start, middle, end);
        }
    }


   public static void printArray(int[] arr) {
        for (int j : arr)
            System.out.print(j + " ");
    }


    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 8, 10, 2 };

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
