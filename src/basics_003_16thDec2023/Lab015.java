package src.basics_003_16thDec2023;

public class Lab015 {

    public static void main(String[] args) {

        //Casting - Mould
        //implicit and explicit casting always prefer to use bigger datatype
        //Byte<short/char<int<long<float<double

        //Widening example
        byte b = 10;
        //int a = b; // 'implicit casting' ==this done by JVM
        int a = (int)b; // this manual done by me -- 'Explicit casting'

        //Narrowing example
        int a1 = 300;
       // byte b1 = a1; //Invalid ==> int cant fit in byte
        byte b1 = (byte)a1; //--> it will work but we will lose some data
        double b2 = a1; //--explicit casting
        System.out.println(b1);
        System.out.println(b2);

        //Widening -> it is process of converting lower type into higher type
        //Narrowing -> it is process of converting higher type into lower type


    }
}
