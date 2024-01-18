package src.basics_004_17thDec2023;

import java.lang.Math;
import java.util.Scanner;

public class Lab038 {

    //Q.User will enter the value of x,y,z and take it as double.
    // and print the result.
    // (x^2 + Y^2 - |Z| )^3


            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the value of x:");
                double x = sc.nextDouble();
                System.out.println("Enter the value of y:");
                double y = sc.nextDouble();
                System.out.println("Enter the value of z:");
                double z = sc.nextDouble();

                double cube_root = Math.cbrt(x * x+ y * y-Math.abs(z));
                System.out.println("Result:"+cube_root);

            }
        }



