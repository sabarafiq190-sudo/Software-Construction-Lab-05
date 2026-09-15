package com.university.lab.hello.lab3.labtask05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchStrategiesTest {

    // Test 1: Duplicate numbers give DIFFERENT results (Behavioral Divergence)
    @Test
    public void testDifferentResultsWithDuplicates() {
        int[] numbers = {10, 20, 30, 20, 40};
        
        int first = SearchStrategies.findFirst(numbers, 20); // Index 1
        int last = SearchStrategies.findLast(numbers, 20);   // Index 3

        assertNotEquals(first, last); // Proves they are NOT equal
    }

    // Test 2: Unique number gives the SAME result (Behavioral Equivalence)
    @Test
    public void testSameResultWhenUnique() {
        int[] numbers = {10, 20, 30, 40};

        int first = SearchStrategies.findFirst(numbers, 30); // Index 2
        int last = SearchStrategies.findLast(numbers, 30);   // Index 2

        assertEquals(first, last); // Proves they ARE equal
    }
}