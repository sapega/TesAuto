package com.playtika.exam;


public class Operations {

    private int numberOne;
    private int numberTwo;

    public Operations(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    //Main operations with integers
    public int adding() {
        return numberOne + numberTwo;
    }

    public int subtract() {
        return numberOne - numberTwo;
    }

    public int multiply() {
        return numberOne * numberTwo;
    }

    public double divide() {
        return numberOne / numberTwo;

    }
}
