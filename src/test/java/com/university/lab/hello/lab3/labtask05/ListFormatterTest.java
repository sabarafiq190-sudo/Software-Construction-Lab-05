package com.university.lab.hello.lab3.labtask05;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ListFormatterTest {

    @Test
    public void testToLowerCaseDoesNotMutateOriginalList() {
        List<String> original = Arrays.asList("HELLO", "WORLD");
        List<String> expectedOriginal = Arrays.asList("HELLO", "WORLD");

        // Call the non-mutating method
        List<String> result = ListFormatter.toLowerCase(original);

        // Verify that a new lowercased list was returned
        assertEquals(Arrays.asList("hello", "world"), result);

        // Assert that the original list remains unchanged
        assertEquals(expectedOriginal, original);
    }

    @Test
    public void testSortInPlaceMutatesList() {
        List<String> names = Arrays.asList("Banana", "Apple");
        
        // Call the mutating method
        ListFormatter.sortInPlace(names);

        // Verify that the original list was modified directly
        assertEquals(Arrays.asList("Apple", "Banana"), names);
    }
}