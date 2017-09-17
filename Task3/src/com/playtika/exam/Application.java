package com.playtika.exam;


public class Application {
    public static void main(String[] args) {
        Reader calculator = new Reader();
        int firstNumber;
        int secondNumber;
        int action;

        do {

            System.out.println("Enter the first number");
            firstNumber = calculator.readNext();

            System.out.println("Enter the second number");
            secondNumber = calculator.readNext();

            Operations operation = new Operations(firstNumber, secondNumber);

            System.out.println("Choose your action");
            System.out.println("1. Adding");
            System.out.println("2. Substracting");
            System.out.println("3. Quit");
            System.out.println("4. Multiply");
            System.out.println("5. Divide");

            action = calculator.readNext();

            switch (action) {
                case 1:
                    System.out.println(operation.adding());
                    break;
                case 2:
                    System.out.println(operation.subtract());
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println(operation.multiply());
                    break;
                case 5:
                    System.out.println(operation.divide());
                    break;
                default:
                    System.out.println("You have typed wrong action");
            }
        } while (action != 3);
    }
}
