package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void Assignment1_1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer number: ");

        short number = input.nextShort();

        System.out.println("Enter another integer number: ");
        short number2 = input.nextShort();

        if (number > number2) {
            System.out.println("the largest number is " + number);
            System.out.println("the smallest number is " + number2);
        } else {
            System.out.println(number2 + " is larger than " + number);

        }
        if (number == number2) {
            System.out.println(number + " is equal to " + number2);
        } else {
            System.out.println(number + " is not equal to " + number2);
        }

        int x = number % 2;
        int y = number2 % 2;
        if (x != 0 || y != 0) {
            System.out.println("There are odd numbers");
        } else {
            System.out.println("There are no odd numbers");
        }
        if (x == 0 || y == 0) {
            System.out.println("There are even numbers");
        } else {
            System.out.println("There are no even numbers");
        }
        if (number < 0 || number2 < 0) {
            System.out.println("There are negative numbers");
        } else {

            System.out.println("There are no negative numbers");
        }
        if (number > 0 || number2 > 0) {
            System.out.println("There are positive numbers");
        } else {

            System.out.println("There are no positive numbers");
        }
        if (number < 100 || number2 < 100) {
            System.out.println("There are numbers less than 100");
        } else {
            System.out.println("There are no numbers less than 100");
        }
    }


    static void Assignment1_2() {
        int time = 100;
        // when int time = 20, "Good evening, go have some rest!" is displayed;
        // when int time = -2, "Good morning, sunshine!" was displayed; corrected the code accordingly;
        //when int time=100, "please check your input time" was displayed (as expected);
        if (time <= 0 || time > 24) {
            System.out.println("Please check you input time");
        } else {
            if (time < 12 ) {
                System.out.println("Good morning, sunshine!");
            }
            if (time >= 13 && time <= 19) {
                System.out.println("Good afternoon and good luck with your work!");
            }
            if (time >= 20 && time <= 24) {
                System.out.println("Good evening, go have some rest!");
            }
        }
//

    }

    public static void main(String[] args) {
        //Assignment1_1();
        Assignment1_2();
    }

}