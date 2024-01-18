package src.basics_003_16thDec2023;

import java.util.Scanner;

public class Lab025 {
    public static void main(String[] args) {


        //Even and Odd Number Program

        //Take an input from user? Java
        //  Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number, I will tel Number is EVEN or ODD");
        int a = sc.nextInt();

       // int a= 34;
        if(a%2 ==1){
            System.out.println("a is ODD Number");
        }else{
            System.out.println("a is EVEN Number");
        }








    }
}
