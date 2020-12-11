package com.barchenko.labs.lab1;

public class BinarySearch {
    int binarySearch(long[] arr, long x)
    {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (x < arr[mid]) {
                high = mid - 1;
            }
            else if (x > arr[mid]) {
                low = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
