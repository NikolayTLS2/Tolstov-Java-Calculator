package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double a = 30;
        double b = 5;

        System.out.println("================================");
        System.out.println("       JAVA CALCULATOR");
        System.out.println("================================");

        System.out.println("Первое число: " + a);
        System.out.println("Второе число: " + b);

        System.out.println("--------------------------------");

        System.out.println("Сложение: " +
                calculator.add(a, b));

        System.out.println("Вычитание: " +
                calculator.subtract(a, b));

        System.out.println("Умножение: " +
                calculator.multiply(a, b));

        System.out.println("Деление: " +
                calculator.divide(a, b));

        System.out.println("================================");
        System.out.println("Вычисления завершены успешно!");
    }
}