package src.basics_007_30thDec2023;

import java.util.Scanner;

//Swapping of Two numbers without-using temp variable
public class Lab077 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of a");
        int a = sc.nextInt();
        System.out.println("Enter the number of b");
        int b = sc.nextInt();

        //Before Swapping
        System.out.println("Before Swapping");
        System.out.println("Value of a is -> " +a);
        System.out.println("Value of b is -> " +b);

        a = a+b;
        b = a-b;
        a = a-b;

        //OR

        //Reminder: This theory will not work, if one of the value is 0
//        a = a * b;
//        b = a / b;
//        a = a / b;

        //After Swapping
        System.out.println("After Swapping");
        System.out.println("Value of a is -> " +a);
        System.out.println("Value of b is -> " +b);


    }

}

