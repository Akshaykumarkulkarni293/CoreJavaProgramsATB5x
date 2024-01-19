package src.basics_005_23rdDec2023;

public class Lab045 {
    public static void main(String[] args) {

        //Q. Print the ODD Number and Even Number in between 1-50.
        // Using For Loop with if else condition

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " ODD Number");
            } else {
                System.out.println(i + " Even Number");
            }
        }
        System.out.println("--- End of Program! ----");
        System.out.println();

        //Only even number
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " ODD Number");
            }

        }

        System.out.println("---- End of Program2 ----");
        System.out.println();
        //Only Even Number
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Even Number");
            }

        }
        System.out.println("---- End of Program3 ----");

        //this way also we can write For Loop

//        for (int j = 1; j <= 10; j=j+1) {
//            System.out.println(j);
//
//        }
    }
}

