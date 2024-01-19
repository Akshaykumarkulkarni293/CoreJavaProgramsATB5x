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

                double results = 0;

                double Results;
                Results = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
                System.out.println(Results);

                // Scanner steam should be closed after we are done
                sc.close();

            }
        }



