package com.barchenko.labs.lab1;

public class LineSearch {
    public int lineSearch(long[] arr, long x)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}
