package com.barchenko.labs.lab1;

public class Lab1 {
    public static void main(String[] args) {

        LineSearch ls = new LineSearch();
        long[] arr1 = new long[300000000];
        System.out.println("array length = " + arr1.length);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }
        long x1 = 100000000;
        double before1 = System.nanoTime();
        int result1 = ls.lineSearch(arr1, x1);
        double after1 = System.nanoTime();
        if (result1 == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at index "
                    + result1);
        System.out.println(convertTimeToMS(after1 - before1) + " ms");

        BinarySearch ob = new BinarySearch();
        double before2 = System.nanoTime();
        int result = ob.binarySearch(arr1, x1);
        double after2 = System.nanoTime();
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
        System.out.println(convertTimeToMS(after2 - before2) + " ms");
    }

    private static double convertTimeToMS(double nanoSec) {
        return nanoSec * 1000000;
    }
}
