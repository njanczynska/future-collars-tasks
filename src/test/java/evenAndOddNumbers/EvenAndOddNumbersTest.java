import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class evenAndOddNumbersTest {
    private evenAndOddNumbers EvenAndOddNumbers;

    public evenAndOddNumbersTest() {
        EvenAndOddNumbers = new evenAndOddNumbers();
    }
    @Test
    public void shouldReturnTrueIfIsEvenNumber() {
        int number = 10;
        Assertions.assertTrue(EvenAndOddNumbers.isEven(number));
    }

    @Test
    public void shouldReturnFalseIfIsNotEvenNumber() {
        int number = 9;
        Assertions.assertFalse(EvenAndOddNumbers.isEven(number));
    }
}