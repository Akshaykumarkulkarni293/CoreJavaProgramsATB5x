package src.basics_006_24thDec2023;

public class Lab061 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Length ->" +array.length);
        System.out.println("Reference address ->" + array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
            // OR

            for (int j = 0; j <= array.length-1; j++) {
                System.out.println(array[j]);
            }

        }


    }


