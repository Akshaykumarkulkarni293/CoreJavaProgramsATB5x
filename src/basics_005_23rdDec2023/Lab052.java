package src.basics_005_23rdDec2023;

import java.util.Scanner;

public class Lab052 {
    public static void main(String[] args) {

        //Interview Question
        //Write a Factorial Program

        // 1! -> 1 = 1
        // 2! -> 2*1 = 2
        // 3! -> 3*2*1 = 6
        // 4! -> 4*3*2*1 = 24
        // 5! -> 5*4*3*2*1 = 120

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int number = sc.nextInt();
        long fact = 1;

        int i =1;
        while ( i <= number){
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial number is -> " +fact);
        sc.close();
    }
}
