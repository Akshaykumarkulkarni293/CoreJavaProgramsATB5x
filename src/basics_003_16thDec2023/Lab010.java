package src.basics_003_16thDec2023;

public class Lab010 {
    public static void main(String[] args) {

        int a= 10;
        int b= 25;
        System.out.println(a+b);

        String name = "Akshay";
        System.out.println(a + name);
        System.out.println(name + a);

        //Interview Q--> Always program will run from left to right

        //Concatenation - String + other
        System.out.println(a+b+name); //--->output will be 10+25+(concat)name
        //output-->35Akshay

        //All the below '+' act as concatenation
        System.out.println(name + a +b);
        //output --> Akshay1025 (All are concated)

    }
}
