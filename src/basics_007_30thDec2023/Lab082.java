package src.basics_007_30thDec2023;

//Prime Number Program

import java.util.Scanner;

public class Lab082 {

    public static void main(String[] args) {


        int i = 0;
        int flag = 0;
        int m = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        m = n/2;
        if (n == 0 || n== 1) {
            System.out.println("Not a Prime");
        } else {
           for ( i =2; i<= m ;i++){
               if (n % 2 == 0) {
                   System.out.println("Not a prime number");
                flag = 1;
                break;
            }
            
        }
    }
        if (flag == 0) {
            System.out.println("Prime Number" + n);
        }
    }
}
