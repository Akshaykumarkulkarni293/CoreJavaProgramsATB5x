package src.basics_004_17thDec2023;

import java.util.Scanner;

public class Lab031 {
    public static void main(String[] args) {

        //Exercise for Switch condition

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser Name chrome, firefox, edge, opera");

        String browser = sc.next();

        switch (browser.toLowerCase()) { // by adding .toLowercase now it is  not case-sensitive
            case "chrome":
                System.out.println("Execute the Chrome Code");
                break;
            case "firefox":
                System.out.println("Execute the Firefox Code");
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;
            default:
                System.out.println("I have not idea which browser is this");
        }
    }
}