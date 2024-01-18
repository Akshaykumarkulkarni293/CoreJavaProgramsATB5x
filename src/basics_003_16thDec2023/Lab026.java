package src.basics_003_16thDec2023;

import java.util.Scanner;

public class Lab026 {
    public static void main(String[] args) {


        //Take Three input from user & Give maximum out of three
        //a,b a>b --> a, else b
        //  Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a & b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            System.out.println("Max number is -->" +a);
        }else{
            System.out.println("Max number is -->" +b);
        }
    }
}
