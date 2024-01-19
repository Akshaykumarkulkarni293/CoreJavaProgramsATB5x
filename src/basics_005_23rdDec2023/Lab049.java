package src.basics_005_23rdDec2023;

public class Lab049 {
    public static void main(String[] args) {

        //Diff between 'While loop' and 'For loop'


        //While Loop

        int i = 10; //A-> initialization
        while (i<=10){ //B -> Condition
            System.out.println(i); //D -> Main code
            i++; // C -> Increment/Decrement
        }
    System.out.println("i");
//we can print i outside loop in 'while Loop'
//bcoz initilization done outside loop

        //For Loop

        for (int j = 10; j <10 ; j++) {
            System.out.println(i);
        }
//    System.out.println(j);
// we cant print j outside loop in 'For Loop'
// bcoz initilization done inside loop


    }
}
