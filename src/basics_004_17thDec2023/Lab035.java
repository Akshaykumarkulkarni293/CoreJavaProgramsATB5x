package src.basics_004_17thDec2023;

public class Lab035 {
    public static void main(String[] args) {

        int b = 45;
        switch (b){
            case 10:
            System.out.println("TEN");
            case 124:
                System.out.println("ONE TWENTY FOUR");
            default:
                System.out.println("default");

                //In this above exercise if both case are not matching
                //with condition then output will be blank
                //if add default at the end then you wiil get default output
        }
    }
}
