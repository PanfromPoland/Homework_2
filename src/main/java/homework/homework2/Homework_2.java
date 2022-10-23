package homework.homework2;

import java.util.Scanner;

public class Homework_2 {
    public static void main(String[] args) {
        int valueOne = 10;
        boolean result1 = valueOne >= 10;
        if (valueOne >= 10) {
            System.out.println("The number is " + valueOne + " greater than or equal to 10 ");
        } else {
            System.out.println("The number is " + valueOne + " less than 10 ");
        }
        int valueTwo = 6;
        boolean result2 = valueTwo >= 10;
        if (valueTwo >= 10) {
            System.out.println("The number is " + valueTwo + " greater than or equal to 10 ");
        } else {
            System.out.println("The number is " + valueTwo + " less than 10 ");
        }
        System.out.println(dividesByTwo(6));

        //printInteger();
        //checkInputNumber();
        CookiesExpression();
    }

    public static void checkInputNumber() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number for check");
//        int valueOne = input.nextInt();
//        if (valueOne >= 10) {
//            System.out.println("The number is " + valueOne + " greater than or equal to 10 ");
//        } else {
//            System.out.println("The number is " + valueOne + " less than 10 ");
//        }
//        int valueTwo = input.nextInt();
//        if (valueTwo >= 10) {
//            System.out.println("The number is " + valueTwo + " greater than or equal to 10 ");
//        } else {
//            System.out.println("The number is " + valueTwo + " less than 10 ");
//        }
    }

    static boolean dividesByTwo(int a) {
        return (a % 2 == 0);
    }

    public static void printInteger() {
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            System.out.println(input.nextInt());
        } else {
            System.out.println("Enter number please");
        }
    }

    public static void CookiesExpression() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rhe number from 1 to 7");
        int cookies = input.nextInt();
        switch (cookies) {
            case 1: {
                System.out.println("One");
                break;
            }
            case 2: {
                System.out.println("Two");
                break;
            }
            case 3: {
                System.out.println("Three");
                break;
            }
            case 4: {
                System.out.println("Four");
                break;
            }
            case 5: {
                System.out.println("Five");
                break;
            }
            case 6: {
                System.out.println("Six");
                break;
            }
            case 7: {
                System.out.println("Seven");
                break;
            }
            default: {
                System.out.println("User enter not valid cookies");
            }
        }
    }
}

