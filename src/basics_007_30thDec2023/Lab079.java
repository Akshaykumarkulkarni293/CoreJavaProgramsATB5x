package src.basics_007_30thDec2023;

import java.util.Scanner;

public class Lab079 {

    public static void main(String[] args) {

        // 12,23,45,90
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n = sc.nextInt();
        int [] int_array = new int[n];

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            int_array[i] = sc.nextInt();
        }

        System.out.println(" -- Output");

        for (int i = 0; i < n; i++) {
            System.out.println(int_array[i]);
        }

        sc.close(); // JVM will slap you


    }
}
