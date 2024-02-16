package src.basics_007_30thDec2023;

import java.util.Scanner;

public class Lab075 {

    //Swapping of Two numbers using temp variable

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

        int temp = a;
        a = b;
        b = temp;

        //After Swapping
        System.out.println("After Swapping");
        System.out.println("Value of a is -> " +a);
        System.out.println("Value of b is -> " +b);

    }
}
