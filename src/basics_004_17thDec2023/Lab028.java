package src.basics_004_17thDec2023;

import java.util.Scanner;

public class Lab028 {
    public static void main(String[] args) {
        //Interview - Grade Calculator

        //Write a program that calculates and displays the letter grade for given
        //numerical score( eg: A,B,C,D & F) based on following:
        //grading scale:

        //A--> 90-100
        //B--> 80-89
        //C--> 70-79
        //D--> 60-69
        //F--> 0-59

        //Basic Steps to follow while writing the code:-


        //1. Input from user
        //Score(Data Type) -->int -->Grade (Char or String)
        //Ask interview for confirmation on doubts


        //2. Basic Logic or Brute force logic, write rough code
          //If score >= 90 && score <= 100 --> Print A
          //If score >= 80 && score <= 89 --> Print B

        //3. Write a real code

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Score");

        int score = sc.nextInt();

        if (score >= 90 && score <= 100){
            System.out.println("Your Score Grade is --> A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Your Score Grade is --> B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Your Score Grade is --> C");
        }else if (score >= 60 && score <= 69) {
            System.out.println("Your Score Grade is --> D");
        }else {
            System.out.println("Your Score Grade is --> F");
        }


        //4. Debug the code
        //Watch 17th dec 2023 Class from 1:50:00 to 1:56:00

        //5. Fix the code and Final it
    }
}
