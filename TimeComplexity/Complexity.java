package com.company.TimeComplexity;

public class Complexity {

    /**     Time complexity here is O(N)
     *
         * for (int i = 0; i < N; i++) {
         *     System.out.println("Hi");
         * }
     */

    /**  O(n^)-linear
         * for (int i = 0; i < N; i++) {
         *     for (int j = i; j < N; j++) {
         *         System.out.println("Hi");
         *     }
         * }
     */

    /**   Time complexity is also O(N)
         * int[] a = {...};
         * int N = a.length;
         *
         * int p = 0;
         * for (int i = 0; i < N; i++) {
         *     while (i - p > 5) {
         *         p++;
         *         a[i] += a[p];
         *     }
         * }
     */

    /**    The time complexity here is O(N^(1/2))
         * int N = ...;
         * boolean isPrime = true;
         *
         * for (int i = 2; i * i <= N; i++) {
         *     if (N % i == 0) {
         *         isPrime = false;
         *     }
         * }
     */


    /**     Time complexity is O(N)
         * int go(int[] a, int l, int r) {
         *     if (l == r)
         *         return a[l];
         *
         *     int mid = (l + r) / 2;
         *     return go(a, l, mid) + go(a, mid + 1, r);
         * }
         *
         * int[] a = {...};
         * int N = a.length;
         *
         * int sum = go(a, 0, N - 1);
     */

    /**     O(NlogN) time
     *  Here, recursive function calculates some weird value over the array.
             *  private static int go(int[] a, int l, int r) {
             *     if (l == r)
             *         return a[l];
             *
             *     int mid = (l + r) / 2;
             *     int sum = go(a, l, mid) + go(a, mid + 1, r);
             *
             *     for (int i = l; i <= r; i++)
             *         sum += a[i];
             *
             *     return sum;
             * }
             *
             * int[] a = {5, 7, 9};
             * int N = a.length;
             *
             * int result = go(a, 0, N - 1);
     */


    /** This is language dependent, but in Java strings are immutable
     *  so each time you append to the string, new string object is created.
     *  this code runs in O(N^2) time.
     *
         * String s = "";
         *
         * for (int i = 1; i <= N; i++)
         *     s = s + "x";
         *
         * System.out.println(s);
     */


    /**     O(NlogN)
         * for (int i = 1; i <= N; i++) {
         *     for (int j = i; j <= N; j += i) {
         *         System.out.println("Hi");
         *     }
         * }
     */


}
