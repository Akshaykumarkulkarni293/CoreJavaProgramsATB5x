package src.basics_005_23rdDec2023;

public class Lab048 {
    public static void main(String[] args) {

        //'Continue Statement'
//Continue statement is used to skip the rest of the code inside a loop for the current iteration and jump to the next iteration of the loop.

        // even and odd number using continue statement
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Val Even of ->" + i);
                continue;
            }
            System.out.println("Val Odd of -> " + i);

        }
    }
}
