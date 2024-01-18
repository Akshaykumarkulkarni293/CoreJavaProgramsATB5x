package src.basics_003_16thDec2023;

public class Lab020 {

    public static void main(String[] args) {

        //ternary Operator

        //Condition
        //int a = condition? if this true print do this : if false do print this

        int a = 10>20 ? 10:20;
        System.out.println(a);

        String b = 24<32? "Twenty four" : "Thirty Two";
        System.out.println(b);

        System.out.println();

        //Exercise1:
        //1.maximum number in two number?

        int a1= 10;
        int b1 = 20;
        int max = a1 < b1 ? a1 :b1;
        int min = a1 < b1 ? b1 : a1;
        System.out.println(max);
        System.out.println(min);


        //2. maximum number in three number?
        //ternary in ternary

        int x = 30;
        int y = 70;
        int z = 45;
        int max1 = (x>y) ? ((x>z)? x : z) : ((y>z) ? y:z);
        System.out.println(max1);


    }
}
