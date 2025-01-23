package recursion;


//Problem Statement
// Write a program to search for a given element in an array using recursion. The program should accept an
// array of integers and a target value from the user in the main function. A recursive function should
// return the index of the first occurrence of the target element in the array. If the target element is not
// found, the function should return -1.

public class searchArray {

    public static int searchElement(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1; 
        }
        if (arr[index] == target) {
            return index; 
        }
        return searchElement(arr, index + 1, target);
    }
    public static void main(String[] args) {
        int arr []={1,2,3,4,5};
        int target=4;
        int result=searchElement(arr, 0, target);
        System.out.println(result);
    }
    
}
