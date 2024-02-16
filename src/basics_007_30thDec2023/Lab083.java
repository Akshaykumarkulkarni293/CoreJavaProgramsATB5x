package src.basics_007_30thDec2023;

// Reverse String
public class Lab083 {
    public static void main(String[] args) {

        String name = " Akshay";
        // o/p -> yahska

        char [] charArray =  name.toCharArray();
        System.out.println(charArray.length);

        System.out.println("Orginal name->" + name);

        int left = 0;
        int right = charArray.length-1;

        while(left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        String rev_name = new String(charArray);
        System.out.println("Reverse name -> " +rev_name);



    }
}
