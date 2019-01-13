package com.codecool;

import java.util.function.Supplier;

public class Fibonacci implements Supplier {

    private int firstNumber = 0;
    private int secondNumber = 1;

    @Override
    public Integer get() {
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber += temp;
        return secondNumber;
    }
}
