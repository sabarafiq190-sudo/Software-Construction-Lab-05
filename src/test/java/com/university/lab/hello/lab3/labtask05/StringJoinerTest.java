package com.university.lab.hello.lab3.labtask05;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class StringJoinerTest {

    @Test
    public void testJoinStringsFormatsCorrectly() {
        List<String> words = Arrays.asList("Software", "Construction", "Lab");
        String result = StringJoiner.joinStrings(words, " - ");

        assertEquals("Software - Construction - Lab", result);
    }
}
