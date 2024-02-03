package src.basics_006_24thDec2023;

public class Lab060 {

    public static void main(String[] args) {


        int [] array1 = {1,2,3,4};
        int [] array2 = {1,2,3,4};

        System.out.println( array1 == array2);
        //output will be false

        int[] array3 = array1;
        System.out.println( array1 == array3);
        // output will be 'true'
          //   OR
        System.out.println(array1.equals(array3));
        // output will be true

        System.out.println(array1.equals(array2));
        //output will be false

        //In case of String -> this condition may true
        // bcoz string compares values and array1 and array2 value will match

        //In case of Array -> this condition is false
        //bcoz in array we don't compare values , we compare reference
        // in above case that is not matching (array1.equals(array2))


    }
}
