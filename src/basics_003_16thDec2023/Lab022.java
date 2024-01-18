package src.basics_003_16thDec2023;

//Increment and Decrement Operator

public class Lab022 {

    public static void main(String[] args) {

        //Increment Operator
        //Pre (++a) and Post(a++)

        int a = 10;

//        System.out.println(++a);
//        System.out.println(a);
//        //pre increment
//        // ++ in front variable like -> ++a --> pre
//        //do increment first then print
//
//        System.out.println();
//
//        System.out.println(a++);
//        System.out.println(a);
//        //post increment
//        // ++ after the variable  like -> a++ -> post
//        //first print then do increment


        System.out.println(++a + a++ + a++ + ++a);
        System.out.println(a);

        //Part A -> (Exp -> 11  a -> 11  ) --> ++a -> O/P --> 11
        //Part B -> (Exp -> 11   a -> 12 ) --> a++ -> O/P --> 11
        //Part C -> (Exp -> 12  a -> 13  ) --> a++ -> O/P --> 12
        //A+B+C += 11+11+12 = 34 . a=13
        //Part D -> (Exp -> 14  a -> 14  ) --> ++a -> O/P --> 14
        //A+B+C+D = 11+11+12+14 = 48 .a= 14


    }
}
