package org.ethz.day1;

import java.util.Random;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input an Integer between 0 and 1000 ");
        int number = input.nextInt();

        int count;
        count = 0;


        Random r = new Random ( ) ;
        int x = r.nextInt (1000) ;
    }
}
