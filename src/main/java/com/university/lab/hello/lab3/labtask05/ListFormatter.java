package com.university.lab.hello.lab3.labtask05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFormatter {

    /**
     * Mutating Method: Explicitly sorts the list passed into it.
     * @param lst the list of strings to sort in-place
     */
    public static void sortInPlace(List<String> lst) {
        Collections.sort(lst);
    }

    /**
     * Non-Mutating Method: Returns a new list with all strings converted to lowercase.
     * The original input list remains completely untouched.
     * 
     * @param lst the original list of strings
     * @return a new list containing lowercase strings
     */
    public static List<String> toLowerCase(List<String> lst) {
        List<String> lowerList = new ArrayList<>();
        for (String str : lst) {
            lowerList.add(str.toLowerCase());
        }
        return lowerList;
    }
}
