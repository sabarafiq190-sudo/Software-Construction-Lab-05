package com.university.lab.hello.lab3.labtask05;

public class Authenticator {
    
    // Internal cached 9-digit MIT ID
    private final char[] mitId = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /**
     * Insecure Method: Returns direct reference to mutable char array.
     * Clients can modify internal state!
     */
    public char[] getMitId(String username) {
        return mitId;
    }

    /**
     * Secure Method: Returns an immutable String object.
     * Prevents internal data corruption.
     */
    public String getMitIdSecure(String username) {
        return new String(mitId);
    }
}