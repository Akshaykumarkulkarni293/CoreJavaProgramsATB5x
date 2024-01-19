package src.basics_005_23rdDec2023;

import java.util.Scanner;

public class Lab039 {

    public static void main(String[] args) {

       //Take a user input and print the information

        //You have to tell JVM which input user is enter
        //sc.next -> String;
        //sc.nextInt() -> Integer
        // sc.nextDouble() -> Double
        // sc.nextBoolean() -> Boolean
        // sc.nextFloat() -> Float

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name ->");
        String name = sc.next();

        System.out.println("Enter your age ->");
        int age = sc.nextInt();

        System.out.println("Enter your salary ->");
        double salary = sc.nextDouble();

        System.out.println("your name is -> " + name );
        System.out.println("your age is -> " + age );
        System.out.println("your salary is -> " + salary );

        sc.close();

    }

}
