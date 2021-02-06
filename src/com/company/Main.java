package com.company;

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
        short year;
        short month;
        short date;
        short format;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        year = input.nextShort();
        System.out.print("Please enter the month: ");
        month = input.nextShort();
        System.out.print("Please enter the date: ");
        date = input.nextShort();
        System.out.println("Please select the date format: 1 - YYYY/MM/DD or 2 - YYYY.MM.DD: ");
        format = input.nextShort();

        if (year < 0 || year > 9999) {
            System.out.println("Invalid year");
        } else {
            if (month < 1 || month > 12) {
                System.out.println("Invalid month");
            } else {
                if (date < 1 || date > 31) {
                    System.out.println("Invalid date");
                } else {
                    if (format == 1) {
                        System.out.println(year + "/" + month + "/" + date);
                    } else {
                        if (format == 2) {
                            System.out.println(year + "." + month + "." + date);

                        }
                    }
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
        } else if (dayNumber > 304 && dayNumber <= 334) {
            System.out.println("It is: November");
        } else if (dayNumber > 334 && dayNumber <= 365) {
            System.out.println("It is: December");
        }
    }

    static void Assignment1_4_2() {

        short month;
        short year;

        Scanner input = new Scanner(System.in);
        System.out.print("Please input the number of the month: ");
        month = input.nextShort();

        if (month < 1 || month > 12) {
            System.out.println("The range of the month is invalid; please input number from 1-12");
        } else {
            System.out.print("Please input the year: ");
            year = input.nextShort();

            if (year <= 0 || year > 9999) {
                System.out.println("The range of the year is invalid; please input number from 1-9999");
            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println("Number of days is 31");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("Number of days is 30");
            } else if (month == 2) {

                boolean isLeapYear;

                //isLeapYear = (((year % 4) == 0) && ((year % 100) !=0)) || ((year % 400) ==0);
                //if (year is not divisible by 4) then (it is a common year)
                //else if (year is not divisible by 100) then (it is a leap year)
                //else if (year is not divisible by 400) then (it is a common year)
                //else (it is a leap year)

                if (year % 4 == 0) {
                    if (year % 100 != 0) {
                        isLeapYear = true;
                    } else {
                        if (year % 400 != 0) {
                            isLeapYear = false;
                        } else {
                            isLeapYear = true;
                        }
                    }

                } else {
                    isLeapYear = false;
                }
                if (isLeapYear) {
                    System.out.println("Number of days is 29");
                } else {
                    System.out.println("The number of days is 28");
                }
            }
        }
    }

    static void Assignment1_5() {

        Scanner input = new Scanner(System.in);
        System.out.print("How many hours a day do you work?");
        short workingHoursInDay = input.nextShort();
        int salary;

        if (workingHoursInDay < 0 || workingHoursInDay > 24) {
            System.out.println("The hour range is invalid");
        } else {
            if (workingHoursInDay <= 8) {
                salary = workingHoursInDay * 10;
            } else {
                salary = 80 + (workingHoursInDay - 8) * 15;
            }
            System.out.println("Your salary is " + salary);
        }
    }

    static void displayHighScorePosition(String firstName, int position) {
        System.out.println(firstName + " managed to get into position " + position + " on the high score table");
    }

    static void calculateHighScorePosition() {
        Scanner input = new Scanner(System.in);
        System.out.print("Put your score: ");
        int score = input.nextInt();

        if (score >= 1000) {
            System.out.println("You are number 1");
        } else if ((score >= 500) && (score < 1000)) {
            System.out.println("You are number 2");
        } else if ((score >= 100) && (score < 500)) {
            System.out.println("You are number 3");
        } else if ((score < 100) && (score >= 0)) {
            System.out.println("You are number 4");
        }
    }

//    static long toMilesPerHour()
//    {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Write the speed in kilometres per hour: ");
//        double kilometresPerHour = input.nextDouble();
//        double convertedValue = kilometresPerHour * 0.621371192;
//
//        if (kilometresPerHour <= 0)
//        {
//            System.out.println("-1");
//        } else
//            {
//            System.out.println("The speed is " + "miles per hour");
//        }
//
//        long toMilesPerHour = (long) (convertedValue);
//
//        //tried this from the stackoverflow as an attempt to tell the compiler that I do not mind losing precision
//
//        return toMilesPerHour;
//
//    }

    public static void main(String[] args) {
        //Assignment1_1();
        //Assignment1_2();
        Assignment1_3();
        //Assignment1_4();
        //Assignment1_4_2();
        //Assignment1_5();
//        displayHighScorePosition("Travis", 3 );
//        displayHighScorePosition("Pete", 2);
//        displayHighScorePosition("John", 1);
//        calculateHighScorePosition();
        //toMilesPerHour();
    }

}

