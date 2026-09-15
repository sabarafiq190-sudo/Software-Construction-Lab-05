package com.university.lab.hello.lab3.labtask05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testFailsFastOnNegativeAltitude() {
        // Verifies that passing a negative altitude throws IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtils.calculateGravitationalPotentialEnergy(-10.0);
        });
    }

    @Test
    public void testValidAltitudeReturnsEnergy() {
        // Verifies normal execution with a valid non-negative altitude
        double result = MathUtils.calculateGravitationalPotentialEnergy(10.0);
        assertEquals(98.1, result, 0.001);
    }
}