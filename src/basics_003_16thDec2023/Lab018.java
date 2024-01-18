package src.basics_003_16thDec2023;

public class Lab018 {

    public static void main(String[] args) {

        String name = "The Testing Academy";
        String name2 = "The Testing Academy";
        String name3 = new String("The Testing academy");

        System.out.println(name == name2); //-> True
        System.out.println(name.equals(name2)); //-> True

        System.out.println(name == name3); //-> False
        System.out.println(name.equals(name3));

        //After making case difference in name3
        System.out.println(name.equalsIgnoreCase(name3));



    }
}
