package com.university.lab.hello.lab3.labtask05;

public class MathUtils {

    /**
     * Calculates the gravitational potential energy of an object.
     * 
     * @param altitude altitude in meters relative to sea level. Requires altitude >= 0
     * @return energy value in Joules
     * @throws IllegalArgumentException if altitude < 0 (failing fast on precondition violation)
     */
    public static double calculateGravitationalPotentialEnergy(double altitude) {
        // Precondition Check: Fail fast if altitude is negative
        if (altitude < 0) {
            throw new IllegalArgumentException("Precondition violated: altitude cannot be negative.");
        }
        
        double g = 9.81; // acceleration due to gravity
        double mass = 1.0; // default mass
        return mass * g * altitude;
    }
}