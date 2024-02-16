package src.basics_007_30thDec2023;

public class Lab070 {

    public static void main(String[] args) {

// What a Function
        // Function can do some Task.

        // How to create a Function?
        // 1. Definition
        // 2. Call the function

        // Function vs Method(is different OOPs or class)

        sayHello4Times(); // Call the function
        sayHello4Times();


        //OOPs - accessModifier (Private, public and protected)

    }

//    accessModifier returnType methodName(parameterList) {
//        // method body
//    }


    static void sayHello4Times(){ // Definition
        for (int i = 0; i < 4; i++) {
            System.out.println("Hello");
        }

    }
}