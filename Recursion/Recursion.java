package com.company.Recursion;

public class Recursion {

    /**
     *  Factorial
     public static int outP(int a) {
     if (a == 1 || a < 1) {
     return a;
     }
     return outP(a - 1) + outP(a - 2);
     }

     public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("Print num:");
     int a=in.nextInt();
     int result = outP(a);
     System.out.println(result);
     }
     */


    /** Fibonacci
     *   public static int outP(int a) {
     *         if (a == 1 || a < 1) {
     *             return a;
     *         }
     *         return outP(a - 1) *a;
     *     }
     *
     *     public static void main(String[] args) {
     *         Scanner in = new Scanner(System.in);
     *         System.out.println("Print num:");
     *         int a=in.nextInt();
     *         int result = outP(a);
     *         System.out.println(result);
     *     }
     */


    /**  a^n power
     *     public static int recursion(int a, int n) {
     *         if(n==0){
     *             return 1;
     *         }
     *         else{
     *             return(a*(recursion(a,n-1))) ;
     *         }
     *     }
     *
     *     public static void main(String[] args) {
     *         Scanner in = new Scanner(System.in);
     *         System.out.println("number:");
     *         int a= in.nextInt();
     *         System.out.println("Power:");
     *         int n= in.nextInt();
     *
     *         System.out.println(recursion(a,n));
     *     }
     */
}
