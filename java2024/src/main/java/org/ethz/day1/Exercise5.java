package org.ethz.day1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Input an Integer ");
        int number = input.nextInt();

        int result = 1;

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            result *= digit; // Multiply the digit
            number /= 10; // Remove the last digit
        }

        System.out.println(result);

    }
}
