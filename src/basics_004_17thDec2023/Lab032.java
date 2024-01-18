package src.basics_004_17thDec2023;

import java.util.Scanner;

public class Lab032 {
    public static void main(String[] args) {

        //Exercise2:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Char, I will tell if it is vowel");
        // vowel are aeiou

        char user_input = sc.next().toCharArray()[0];
        System.out.println(user_input);

        switch (user_input) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not an Vowel, it is constant");
        }
    }
}
