package src.basics_005_23rdDec2023;

import java.util.Scanner;

public class Lab054 {

    public static void main(String[] args) {

        //Sum of digit entered by user
        //eg: 5 -> 5+4+3+2+1 = 15
        // 4 -> 4+3+2+1 = 10

        long sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number= sc.nextInt();


        // Using While loop
        int i = 1;
        while (i<= number){
            sum = sum + i;
            i++;
        }
        System.out.println("sum of digit -> " + sum);


        //Using For statement
//        for (int i = 1; i <= number ; i++) {
//            sum = sum + i;
//
//        }
//        System.out.println("sum of digit -> " +sum);
    }
}
