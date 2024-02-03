package src.basics_004_17thDec2023;

import java.util.Scanner;

public class Lab030 {

    public static void main(String[] args) {

        // If, Switch - Condition Based
        // Loops → Which will repeat something for, while, do while

        // Switch Condition

        //Condition based - Multiple condition
        String day = null;

        // Which day is today!!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1-7, I will tell which day it is");
        // 1 → Monday, 7 → Sunday, , invalid → 99 are you mad?
        int dayNumber = sc.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Are You Mad!");
                break; // if this break is optional if default is last option
        }
        System.out.println("- end of program -");
    }
}