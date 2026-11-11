package org.example;

public class Calculator {

    // Сложение двух чисел
    public double add(double a, double b) {
        return a + b;
    }

    // Вычитание второго числа из первого
    public double subtract(double a, double b) {
        return a - b;
    }

    // Умножение двух чисел
    public double multiply(double a, double b) {
        return a * b;
    }

    // Деление первого числа на второе
    public double divide(double a, double b) {

        if (b == 0) {
            throw new ArithmeticException(
                    "Деление на ноль невозможно!"
            );
        }

        return a / b;
    }
}
