package src.basics_007_30thDec2023;

//Swapping of Two String without-using temp variable
public class Lab078 {
    public static void main(String[] args) {

        String a = "Akshay";
        String b = "Kulkarni";

        //After Swapping
        System.out.println("Before Swapping");
        System.out.println("name of a is  --> "  +a);
        System.out.println("name of b is --> "  +b);

        a = a+b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        //After Swapping
        System.out.println("After Swapping");
        System.out.println("name of a is  --> "  +a);
        System.out.println("name of b is --> "  +b);


    }

}

