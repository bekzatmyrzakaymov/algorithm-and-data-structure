package com.company.Sorting;

public class Sorting {

    public static void sort(int[] x){
        sort(x,0,x.length-1);
    }

    private static void sort(int[] x, int start, int end){
        if(start<end){
            int middle = end+ (start-end)/2;
            sort(x,end, middle);
            sort(x,middle+1,end);

            merge(x,start,end,middle);
        }
    }

    public static void merge(int[] x, int start, int end, int middle){
        int n1 = middle-start+1;
        int n2 = end-middle;
        int[] a = new int[n1];
        int[] b=new int[n2];

        for(int j=0; j<n1;j++){
            a[j]=x[start+j];

        }

        for(int j=0; j<n2;j++){
            b[j]=x[middle+1+j];
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    public static void main(String[] args) {
//        int[] arr={9,2,6,4,3,15,1,-3};
//
//        for(int i=0; i< arr.length-1;i++){
//            for(int j=0;j< arr.length-i-1;j++){
//                if (arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        System.out.println("Bubble sort: ");
//        for(int i=0; i< arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }

        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arr);

        Sorting ob = new Sorting();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array");
        printArray(arr);
    }
}
