package ageVerification;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeVerificationTest {

    @Test
    void shouldCheckIfAgeIsOver18() {
        int age = 20;
        boolean isOver18 = AgeVerification.isMature(age);
        Assertions.assertTrue(isOver18);
    }

    @Test
    void shouldCheckIfAgeIsEqualTo18() {
        int age = 18;
        boolean isEqualTo18 = AgeVerification.isMature(age);
        Assertions.assertTrue(isEqualTo18);
    }

    @Test
    void shouldCheckIfAgeIsUnder18() {
        int age = 16;
        boolean isOver18 = AgeVerification.isMature(age);
        Assertions.assertFalse(isOver18);
    }
}