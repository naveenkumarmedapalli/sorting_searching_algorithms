/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearSearch;

/**
 *
 * The time complexity of linear search is O(n).   
 */


public class LinearSerach {

    public static void main(String[] args) {

        int arr[] = {2, 3, 4, 10, 40};

        int searchElement = 10;

        int result = new LinearSerach().search(arr, searchElement);

        if (result == -1) {
            System.out.print("Element is not present in array");
        } else {
            System.out.print("Element is present at index " + result);
        }
    }
    
    int search(int arr[], int searchElement) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                return i;
            }
        }
        return -1;
    }

}
