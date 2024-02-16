package src.basics_007_30thDec2023;
//print the whole diagonal box

public class Lab081 {

    public static void main(String[] args) {

        int [][] array_2d = new int[3][3];
        array_2d [0][0] = 17;
        array_2d [0][1] = 13;
        array_2d [0][2] = 78;
        array_2d [1][0] = 43;
        array_2d [1][1] = 87;
        array_2d [1][2] = 10;
        array_2d [2][0] = 98;
        array_2d [2][1] = 1;
        array_2d [2][2] = 100;
        // | 17 13 78|
        // | 43 87 10|
        // | 98 1 100|


        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                if (i == j) { // only for diagnal elements use this
                    System.out.print("\t" + array_2d[i][j]);
                }
            }
            System.out.println();

        }


    }
}
