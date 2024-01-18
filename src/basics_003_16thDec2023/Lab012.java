package src.basics_003_16thDec2023;

public class Lab012 {
    public static void main(String[] args) {

        //Relational Operator
        // > , < , >= , <= , == , !=

        int age_Akshay = 28;
        int age_gowri = 26;
        boolean result = age_Akshay > age_gowri;

        System.out.println(result);

        int a = 10;
        int b = 10;
        boolean validation = a == b; //reference
        System.out.println(validation);

        System.out.println(10 > 10);
        System.out.println(10 < 10);
        System.out.println(10 >= 10);
        System.out.println(10 <= 10);
        System.out.println(10 == 10);

        System.out.println();

        //  System.out.println('A' = 65); //'=' Assign operator
        System.out.println('A' == 65); //ASCII
        System.out.println('A');
        System.out.println('B');

        //Interview question
//        byte b = 65;
//        System.out.println('A' == b);
         //in this above code A = is ASCII 65 and b become as int datatype
        // when you do A == b --> output will be 'true'
        System.out.println('A' == 65.0f); //--> output will be true
        System.out.println('A' == 65);//--> output will be true



    }
}
