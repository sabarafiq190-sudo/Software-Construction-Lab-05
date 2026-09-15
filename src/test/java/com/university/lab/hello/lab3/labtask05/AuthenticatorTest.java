package com.university.lab.hello.lab3.labtask05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthenticatorTest {

    @Test
    public void testInsecureMethodCorruptsInternalData() {
        Authenticator auth = new Authenticator();

        // Client gets internal char array and corrupts first 5 digits to '*'
        char[] leakedArray = auth.getMitId("student_user");
        for (int i = 0; i < 5; i++) {
            leakedArray[i] = '*';
        }

        // Verification: The internal cached data in Authenticator is corrupted!
        char[] corruptedArray = auth.getMitId("student_user");
        assertEquals('*', corruptedArray[0]);
        assertEquals('*', corruptedArray[4]);
    }

    @Test
    public void testSecureMethodPreventsCorruption() {
        Authenticator auth = new Authenticator();

        // Client receives immutable String
        String secureId = auth.getMitIdSecure("student_user");

        // Verification: Returned string matches original value
        assertEquals("123456789", secureId);
    }
}
