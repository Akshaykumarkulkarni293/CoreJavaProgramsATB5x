package src.basics_004_17thDec2023;

import java.util.Scanner;

public class Lab029 {

    public static void main(String[] args) {

        // Triangle Classifier:

        //Write a program that classifies a triangle based on its side lengths.
        //Given three input values representing the lengths of the sides, determine

        //if the triangle is equilateral (all sides are equal),
        //isosceles (exactly two sides are equate), or
        //scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.

        //side 1, side 2, side 3 → side 1 - side 2 - side 3 → equilateral
        // (side1 = side 2) or (side 2 = side 3) → isosceles
        // scalene -> (side1 != side2 != side3)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1, side2 , side3, I will tell about triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if ((side1 == side2) && (side2== side3) && (side1 == side3)){
            System.out.println("Triangle is equilateral ");
        } else if ((side1 == side2) || (side2== side3) || (side1 == side3)) {
            System.out.println("Triangle is isosceles ");
        }else{
            System.out.println("Triangle is scalene ");
            }
        }


    }

