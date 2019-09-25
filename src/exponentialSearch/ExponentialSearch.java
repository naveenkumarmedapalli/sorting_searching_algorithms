/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exponentialSearch;

import java.util.Arrays;

/**
 *
 *
 * Time Complexity : O(Log n)
 *
 * Exponential Binary Search is particularly useful for unbounded searches,
 * where size of array is infinite.
 *
 * It works better than Binary Search for bounded arrays, and also when the
 * element to be searched is closer to the first element.
 */
public class ExponentialSearch {

    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;
        int result = exponentialSearch(arr, arr.length, x);

        System.out.println((result < 0)
                ? "Element is not present in array"
                : "Element is present at index "
                + result);
    }

    private static int exponentialSearch(int[] arr, int length, int searchElement) {

        if (arr[0] == searchElement) {
            return 0;
        }
        int i = 1;

        while (i < length && arr[i] <= searchElement) {
            i = i * 2;
        }

        return Arrays.binarySearch(arr, i / 2, length, searchElement);

    }

}
