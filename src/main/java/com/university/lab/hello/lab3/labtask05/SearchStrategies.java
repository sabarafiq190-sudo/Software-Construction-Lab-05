package com.university.lab.hello.lab3.labtask05;

public class SearchStrategies {

    // Finds the FIRST matching index
    public static int findFirst(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return arr.length; // Returns array length if not found
    }

    // Finds the LAST matching index
    public static int findLast(int[] arr, int val) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1; // Returns -1 if not found
    }
}