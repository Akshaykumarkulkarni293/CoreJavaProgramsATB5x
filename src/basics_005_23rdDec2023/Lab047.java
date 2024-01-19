package src.basics_005_23rdDec2023;

public class Lab047 {
    public static void main(String[] args) {

//'Break;' statement is used to terminate the innermost loop or switch statement that it appears in.
//Its primary purpose is to exit a loop prematurely based on a certain condition, without waiting for the loop to complete its normal iteration.
//The break statement is typically used within while, do-while, and for loops, as well as switch statements.

        for (int i = 1; i < 10 ; i++) {
            System.out.println(i);
            break;
       //     System.out.println("exit");
        }

        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            if (i%2 == 0) {
                break;
            }

        }
    }

}
