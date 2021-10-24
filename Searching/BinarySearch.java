package com.company.Searching;

public class BinarySearch {

    int binarySearch(int[] arr, int start, int end, int target) {

        if (end >= start) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] > target)
                return binarySearch(arr, start, mid - 1, target);

            return binarySearch(arr, mid + 1, end, target);
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int[] arr = { 2, 1, 2, 3, 4, 10};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result+" ");

        if(arr[result+1]==x){
            System.out.println(result+1);
        }
        else{
            System.out.println(result);
        }
    }

}
