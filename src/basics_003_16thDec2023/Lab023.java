package src.basics_003_16thDec2023;

public class Lab023 {
    public static void main(String[] args) {

        //Decrement Operator

        int a = 10;

//        System.out.println(--a);
//        System.out.println(a);
//
//        System.out.println(a--);
//        System.out.println(a);


//        System.out.println(--a + a-- + a-- + --a);
//        System.out.println(a);
//
//        //Part A -> (Exp -> 9   a -> 9   ) --> --a -> O/P --> 9
//        //Part B -> (Exp -> 9   a -> 8  ) --> a-- -> O/P --> 9
//        //Part C -> (Exp -> 8   a -> 7  ) --> a-- -> O/P --> 8
//        //Part D -> (Exp -> 6   a -> 6   ) --> --a -> O/P --> 6
//        //A+B+C+D =  = 9+9+8+6 = 32 .a= 6

        System.out.println(--a + a++ + ++a - a--);
        System.out.println(a);
        //Part A -> (Exp -> 9   a -> 9    ) --> --a -> O/P --> 9
        //Part B -> (Exp -> 9   a -> 10   ) --> a++ -> O/P --> 9
        //Part C -> (Exp -> 11   a -> 11  ) --> ++a -> O/P --> 11
        //Part D -> (Exp -> 11   a -> 10   ) --> a-- -> O/P --> 11
        //A+B+C+D =  = 9+9+11-11 = 18 .a= 10




    }
}
