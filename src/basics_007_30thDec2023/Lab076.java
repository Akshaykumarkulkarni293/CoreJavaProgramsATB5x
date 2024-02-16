package src.basics_007_30thDec2023;

//Swapping of two string using temp variable

public class Lab076 {

    public static void main(String[] args) {

        String a = "Akshay";
        String b = "Kulkarni";

        //After Swapping
        System.out.println("Before Swapping");
        System.out.println("name of a is  --> "  +a);
        System.out.println("name of b is --> "  +b);

        String temp = a;
        a = b;
        b = temp;

        //After Swapping
        System.out.println("After Swapping");
        System.out.println("name of a is  --> "  +a);
        System.out.println("name of b is --> "  +b);



    }
}

