package src.basics_003_16thDec2023;

public class Lab014 {
    public static void main(String[] args) {

        int a = 12;
        boolean b = a > 10 || a < 5 ;
        //a>10 is true and a<5 is false but with OR condition this output 'True'
        System.out.println(b); //==> true
        System.out.println(!(b)); //==> false

        System.out.println();

        int c = 28;
        boolean d = c > 29 && c < 384 ;
        //c > 29 is false and c < 5 is true but with AND condition this output 'false'
        System.out.println(d); //==> false
        System.out.println(!(d)); //==> true

       int x = 90;
       int y = 90;
       boolean z = (x >= y);

        System.out.println(z); //--> true
        System.out.println(!(z)); //--> false


    }
}
