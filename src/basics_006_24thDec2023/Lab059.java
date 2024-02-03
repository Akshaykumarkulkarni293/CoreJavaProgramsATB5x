package src.basics_006_24thDec2023;

public class Lab059 {

    public static void main(String[] args) {


        int[] a = new int[4];
        // when you write above code, int default value is 0
        // you given int[4] it means it will write 4 size length box
        // int[] a = {0,0,0,0}

        System.out.println(a.length);
       // length of array a is 4
        // but it index start from 0,1,2,3

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
//      System.out.println(a[4]); // it will throw exception as it has only upto 3 index number

        a[0]  =76;
        a[1] =65;
        a[3] = 13;
        a[2] =54;
        a[0] = 34; // when u reassign a[0], it will print latest value
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);


        final int[] b = new int[2];
        System.out.println(b.length); // --> //output is  2
        //mean int[] b = { 0,0}

        //final make sure that index length fixed, not value of index
        // you can still change or give value for index

        b[0]  =76;
        b[1] =65;
        System.out.println(b[0]);
        System.out.println(b[1]);


    }
}
