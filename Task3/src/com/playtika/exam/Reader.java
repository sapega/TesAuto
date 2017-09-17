package com.playtika.exam;

import java.io.IOException;
import java.util.Scanner;

public class Reader {
    //Enter a number if not an integer number it will allow to enter again
    public int readNext() {
        try {
            Scanner scanner = new Scanner(System.in);
            int number;
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            } else {
                throw new IOException();

            }
            return number;
        } catch (IOException e) {
            System.out.println("You have typed not an integer number. Please try again");
        }
        return readNext();
    }
}

