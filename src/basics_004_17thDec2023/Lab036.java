package src.basics_004_17thDec2023;

public class Lab036 {
    public static void main(String[] args) {

        //Advance switch Program
        //JDK >13

//        int itemcode = 007;
//        switch (itemcode) {
//            case 001, 002, 003:
//                System.out.println("it is a laptop");
//                break;
//            case 004, 005:
//                System.out.println("it is a mechanical device");
//                break;
//            default:
//                System.out.println("i don't no");
//        }


        // In this below program
        // we don't need to use break
        // we are using in front of case instead of : we are using ->
        //one disadvantage it generally take one line sout

        int itemcode = 003;
        switch (itemcode){
            case 001 -> System.out.println("it is a laptop");
            case 002 -> System.out.println("it is machine");
            case 003 -> System.out.println("it is mobile");
            default -> System.out.println("I don't no");
        }




    }
}
