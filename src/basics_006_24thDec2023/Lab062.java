package src.basics_006_24thDec2023;

import java.util.Scanner;

public class Lab062 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float [] marks = new float[5];

        System.out.println("Enter the First Subject Marks");
        marks[0] = sc.nextFloat();
        System.out.println("Enter the Second Subject Marks");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the Third Subject Marks");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the Fourth Subject Marks");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the Fifth Subject Marks");
        marks[4] = sc.nextFloat();

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

       sc.close();



    }
}
