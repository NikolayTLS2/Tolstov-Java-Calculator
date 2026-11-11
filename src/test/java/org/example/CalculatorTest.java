
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    private static final double DELTA = 0.000001;

    // СЛОЖЕНИЕ

    @Test
    void testAddPositiveNumbers() {
        assertEquals(15.0, calculator.add(10, 5), DELTA);
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-15.0, calculator.add(-10, -5), DELTA);
    }

    @Test
    void testAddWithZero() {
        assertEquals(10.0, calculator.add(10, 0), DELTA);
    }

    // ВЫЧИТАНИЕ

    @Test
    void testSubtractPositiveNumbers() {
        assertEquals(5.0, calculator.subtract(10, 5), DELTA);
    }

    @Test
    void testSubtractNegativeResult() {
        assertEquals(-5.0, calculator.subtract(5, 10), DELTA);
    }

    @Test
    void testSubtractNegativeNumbers() {
        assertEquals(-5.0, calculator.subtract(-10, -5), DELTA);
    }

    // УМНОЖЕНИЕ

    @Test
    void testMultiplyPositiveNumbers() {
        assertEquals(50.0, calculator.multiply(10, 5), DELTA);
    }

    @Test
    void testMultiplyNegativeNumbers() {
        assertEquals(50.0, calculator.multiply(-10, -5), DELTA);
    }

    @Test
    void testMultiplyByZero() {
        assertEquals(0.0, calculator.multiply(10, 0), DELTA);
    }

    // ДЕЛЕНИЕ

    @Test
    void testDividePositiveNumbers() {
        assertEquals(2.0, calculator.divide(10, 5), DELTA);
    }

    @Test
    void testDivideWithNegativeNumber() {
        assertEquals(-2.0, calculator.divide(-10, 5), DELTA);
    }

    @Test
    void testDivideWithFractionalResult() {
        assertEquals(2.5, calculator.divide(5, 2), DELTA);
    }

    // НЕГАТИВНЫЕ СЦЕНАРИИ

    @Test
    void testDivideByZero() {
        assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );

    }
}
