package com.company;

import com.company.BST.BinarySearch;
import com.company.Heap.MyHeap;

import java.util.Arrays;

public  class Main {

    private final char[] s;

    public Main(char[] s) {
        this.s = s;
    }

    public int hashCode(){
        int hash =0;
        for(int i=0; i< s.length;i++)
            hash=s[i]+(31*hash);
        return hash;
    }


   public static void kthElement(int arr[], int k) {

        int temp;
        for(int i=0;i<k;i++)
            for (int j = 0; j < arr.length - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

       System.out.println("K-th largest element is: ");
        System.out.println(arr[arr.length-k]);

       //        int arr[]={1, 2, 11, 45, 70, 5, 50};
//        int k = 2;
//        kthElement(arr,k);

    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }

    private int findFirst(int[] nums, int target){
        int position = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            if(nums[mid] == target) position = mid;
        }
        return position;
    }

    private int findLast(int[] nums, int target){
        int position = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(nums[mid] == target) position = mid;
        }
        return position;
    }


   public static int guess(int num) {
        return 0;
    }

    public static int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = guess(mid);
            if (res == 0) {
                return mid;
            } else if (res < 0)
                high = mid - 1;
            else {
                low = mid + 1;
            }
        }
        return -1;
    }


    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Duplicate: ");
        int[] arr2={1,2,2,3,4};
        System.out.println(findDuplicate(arr2));


        System.out.println("be");
    int arr[]={9,2,6,4,3,15,1,-3};

    for(int i=0; i< arr.length-1;i++){
        for(int j=0;j< arr.length-i-1;j++){
            if (arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
        System.out.println("Bubble sort: ");
    for(int i=0; i< arr.length;i++){
        System.out.print(arr[i] + " ");
    }



      /**  String s = "Bekzat";
        int code = s.hashCode();
        System.out.println(code);

       */

    }
}
