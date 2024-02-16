package src.basics_007_30thDec2023;

public class Lab069 {

    public static void main(String[] args) {

        int c = ak_sum(); // No arguments
        int c1 = ak_sum(2); // 1 arguments
        int c2 = ak_sum(2,9); // 2 arguments
        int c3 = ak_sum(1,2,4);
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        sayHello(); // Call to the function


    }

    static int ak_sum(int input_1, int input_2){ // Definition of the Function
        return input_1+input_2;
    }
    static int ak_sum(int input_1){
        return input_1;
    }

    static int ak_sum(){
        return 99;
    }

    static int ak_sum(int input_1, int input_2, int c){
        return input_1+input_2+c;
    }

    static void sayHello(){
        System.out.println("Say Yes");
    }



}
