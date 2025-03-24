package com.agnes;

public class Calculator {
    int a;
    int b;

    void add() {
        System.out.println(a + b);
    }

    void multiply() {
        System.out.println(a * b);
    }



public static class SimpleCalculator {
        public static void main(String[] args) {
            Calculator operations = new Calculator();
            operations.a = 20;
            operations.b = 10;
            operations.add();
            operations.multiply();


        }
    }
}
