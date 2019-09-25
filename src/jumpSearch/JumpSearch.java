/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumpSearch;

/**
 *
 * Time Complexity is O(√n)
 *
 * Works only sorted arrays.
 *
 * The optimal size of a block to be jumped is (√ n). This makes the time
 * complexity of Jump Search O(√ n).
 *
 * The time complexity of Jump Search is between Linear Search ( ( O(n) ) and
 * Binary Search ( O (Log n) ).
 *
 * Binary Search is better than Jump Search, but Jump search has an advantage
 * that we traverse back only once (Binary Search may require up to O(Log n)
 * jumps, consider a situation where the element to be searched is the smallest
 * element or smaller than the smallest).
 *
 * So in a system where binary search is costly, we use Jump Search.
 *
 */
public class JumpSearch {

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21,
            34, 55, 89, 144, 233, 377, 610};
        int x = 55;

        // Find the index of 'x' using Jump Search 
        int index = jumpSearch(arr, x);

        // Print the index where 'x' is located 
        System.out.println("Number " + x + " is at index " + index);
    }

    private static int jumpSearch(int[] arr, int searchElement) {

        int length = arr.length;

        // Finding block size to be jumped 
        int blockSize = (int) Math.floor(Math.sqrt(length));

        // Finding the block where element is present (if it is present) 
        int prev = 0;

        while (arr[Math.min(blockSize, length) - 1] < searchElement) {
            prev = blockSize;
            blockSize += (int) Math.floor(Math.sqrt(length));
            if (prev >= length) {
                return -1;
            }
        }

        while (arr[prev] < searchElement) {
            prev++;

            // If we reached next block or end of array, element is not present. 
            if (prev == Math.min(blockSize, length)) {
                return -1;
            }
        }

        // If element is found 
        if (arr[prev] == searchElement) {
            return prev;
        }

        return -1;

    }

}
