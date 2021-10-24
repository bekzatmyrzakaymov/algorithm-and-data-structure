package com.company.Sorting;

public class BubbleSort {

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++)
            for (int j = 0; j < arr.length-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }


    public static void main(String[] args) {

        BubbleSort ob = new BubbleSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Given array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        ob.bubbleSort(arr);
        System.out.println("Sorted array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}
