/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarySearch;

/**
 *
 * The time complexity of binary search is O(Log n). => using recursion
 */
public class BinarySearch {

    public static void main(String[] args) {

        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 10, 11, 20};
        int n = arr.length;
        System.out.println("length : " + n);
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    int binarySearch(int[] arr, int startIndex, int noOfElements, int searchElement) {

        if (noOfElements >= startIndex) {

            int middle = startIndex + (noOfElements - 1) / 2;

            if (arr[middle] == searchElement) {
                return middle;
            }

            if (arr[middle] > searchElement) {
                return binarySearch(arr, startIndex, middle - 1, searchElement);
            }

            return binarySearch(arr, middle + 1, noOfElements, searchElement);

        }
        return -1;
    }
}
