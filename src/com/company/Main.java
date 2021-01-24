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
            if (time < 12) {
                System.out.println("Good morning, sunshine!");
            }
            if (time >= 13 && time <= 19) {
                System.out.println("Good afternoon and good luck with your work!");
            }
            if (time >= 20 && time <= 24) {
                System.out.println("Good evening, go have some rest!");
            }
        }


    }

    static void Assignment1_3() {
        short date = 30;
        short month = 6;
        short year = 1988;

        if (year < 0 || year > 9999) {
            System.out.println("Invalid year");
        }
        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
        }
        if (date < 1 || date > 31) {
            System.out.println("Invalid date");
        } else {
            System.out.println(year + "/" + month + "/" + date);
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        year = input.nextShort();
        System.out.print("Please enter the month: ");
        month = input.nextShort();
        System.out.print("Please enter the date: ");
        date = input.nextShort();

        if (year < 0 || year > 9999) {
            System.out.println("Invalid year");
        } else {
            if (month < 1 || month > 12) {
                System.out.println("Invalid month");
            } else {
                if (date < 1 || date > 31) {
                    System.out.println("Invalid date");
                } else {
                    System.out.println(year + "/" + month + "/" + date);

                }
            }

        }

    }

    static void Assignment1_4() {
        short dayNumber;

        Scanner input = new Scanner(System.in);
        System.out.print("Please write a number: ");
        dayNumber = input.nextShort();

        if (dayNumber <= 0 || dayNumber > 365) {
            System.out.println("Invalid number range; please input a number from 1 to 365");
        } else
            System.out.println("The day number is: " + dayNumber);
        if (dayNumber > 0 && dayNumber <= 31) {
            System.out.println("It is: January");
        } else if (dayNumber > 31 && dayNumber <= 59) {
            System.out.println("It is: February");
        } else if (dayNumber > 59 && dayNumber <= 90) {
            System.out.println("It is: March");
        } else if (dayNumber > 90 && dayNumber <= 120) {
            System.out.println("It is: April");
        } else if (dayNumber > 120 && dayNumber <= 151) {
            System.out.println("It is: May");
        } else if (dayNumber > 151 && dayNumber <= 181) {
            System.out.println("It is: June");
        } else if (dayNumber > 181 && dayNumber <= 212) {
            System.out.println("It is: July");
        } else if (dayNumber > 212 && dayNumber <= 243) {
            System.out.println("It is: August");
        } else if (dayNumber > 243 && dayNumber <= 273) {
            System.out.println("It is: September");
        } else if (dayNumber > 273 && dayNumber <= 304) {
            System.out.println("It is: October");
        } else if (dayNumber > 304 && dayNumber <= 324) {
            System.out.println("It is: November");
        } else if (dayNumber > 324 && dayNumber <= 355) {
            System.out.println("It is: December");
        }
    }

    static void Assignment1_4_2() {

        short month;
        short year;

        Scanner input = new Scanner(System.in);
        System.out.print("Please input the number of the month: ");
        month = input.nextShort();

        if (month < 1 || month > 24) {
            System.out.println("The range of the month is invalid; please input number from 1-12");
        } else
            System.out.print("Please input the year: ");
        year = input.nextShort();

        if (year <= 0 || year > 9999) {
            System.out.println("The range of the year is invalid; please input number from 1-9999");
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Number of days is 31");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Number of days is 30");
        } else if (month == 2) {
            System.out.println("The number of days is 28");}
    }

        public static void main (String[]args) {
            //Assignment1_1();
            //Assignment1_2();
            //Assignment1_3();
            //Assignment1_4();
            Assignment1_4_2();
        }

    }

