package com.company.practise;

public class Main {

    public static int search(int[] arr, int target){

        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int middle=(start+end)/2;

            if(arr[middle]==target)
                return middle;

            if(arr[middle]>target)
               end=middle - 1;
            else
                start=middle+1;
        }

        return -1;
    }


    public static void main(String[] args) {

        int[] arr={3,4,4,5,7,11,15};
        System.out.println(search(arr,4));
    }
}
