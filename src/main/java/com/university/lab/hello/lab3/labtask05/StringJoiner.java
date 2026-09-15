package com.university.lab.hello.lab3.labtask05;

import java.util.List;

public class StringJoiner {

    /**
     * BAD OPERATIONAL SPECIFICATION:
     * This method iterates over the words list using a for loop from index 0 to words.size() - 1.
     * In each iteration, it appends the current word to a StringBuilder. If the current index is less
     * than words.size() - 1, it also appends the delimiter string. Finally, it converts the StringBuilder
     * to a String and returns it.
     *
     * GOOD DECLARATIVE SPECIFICATION:
     * Returns the concatenation of elements in order, with the delimiter inserted between each adjacent pair.
     *
     * @param words list of strings to join
     * @param delimiter string to place between elements
     * @return joined string formatted with delimiters
     */
    public static String joinStrings(List<String> words, String delimiter) {
        if (words == null || words.isEmpty()) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            sb.append(words.get(i));
            if (i < words.size() - 1) {
                sb.append(delimiter);
            }
        }
        return sb.toString();
    }
}
