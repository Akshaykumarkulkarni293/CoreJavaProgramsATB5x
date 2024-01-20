package src.basics_005_23rdDec2023;

import java.util.Scanner;

public class Lab053 {

    public static void main(String[] args) {

        //Interview Question
        //Write a Factorial Program
       // using For Loop

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int number = sc.nextInt();

        long fact = 1;

        for (int i = 1; i <=number ; i++) {
            fact = fact *i ;
        }
        System.out.println("Fact is -> " + fact);
        sc.close();
    }

}
