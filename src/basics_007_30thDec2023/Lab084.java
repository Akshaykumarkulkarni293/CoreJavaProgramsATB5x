package src.basics_007_30thDec2023;

//Reverse String
public class Lab084 {

    public static void main(String[] args) {

        String name = "Akshay";

        String y =" ";

        for (int i = name.length()-1; i >= 0 ; i--) {
            y = y + name.charAt(i);
        }
        System.out.println(y);
    }
}
