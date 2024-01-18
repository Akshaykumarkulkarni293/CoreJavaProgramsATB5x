package src.basics_002_10thDec2023;

public class Lab005 {
    public static void main(String[] args) {

        //ex1:
        int age = 28;

        //Normal (concat operation (+))
        System.out.println("Your age is " + age);
        //Formatting purpose
        System.out.printf("your age is %d" , age);
        // here d will be replaced with variable data type
        // for all datatype %d
        // float %f
        // short %s
        //char %c

        System.out.println("  ");

        //ex2:
        String name = "Akshay";
        //Normal (concat operation (+))
        System.out.println("Your name is " + name);
        //Formatting purpose
        System.out.printf("your name is %s" , name);

        System.out.println(" ");

        //ex3:
        float pi = 3.142f;
        //Normal (concat operation (+))
        System.out.println("Your pi value " + pi);
        //Formatting purpose
        System.out.printf("your pi value %f" , pi);



    }
}
