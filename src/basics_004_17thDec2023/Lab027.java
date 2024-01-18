package src.basics_004_17thDec2023;

import java.util.Scanner;

public class Lab027 {
    public static void main(String[] args) {

        //If, Else if , else

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();

        // What if - Number is >20 , <20 ,<10

        if (number >20){
            System.out.println("Number is greater than 20");
        } else if (number >10) {
            System.out.println("Number is greater than 10");
        } else {
            System.out.println("number is less than 20");
        }


    }

}
