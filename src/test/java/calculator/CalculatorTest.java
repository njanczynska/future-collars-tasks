import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    CalculatorTest() {
        calculator = new Calculator();
    }

    @Test
    void addTest() {
        int a = 4, b = 2;
        int add = calculator.add(a, b);
        Assertions.assertEquals(6, add);
    }

    @Test
    void subtractTest() {
        int a = 4, b = 2;
        int subtract = calculator.subtract(a, b);
        Assertions.assertEquals(2, subtract);
    }

    @Test
    void multiplyTest() {
        int a = 4, b = 2;
        int multiply = calculator.multiply(a, b);
        Assertions.assertEquals(8, multiply);
    }

    @Test
    void divisionTest() {
        int a = 4, b = 2;
        int division = calculator.division(a, b);
        Assertions.assertEquals(2, division);
    }

}