package src.basics_003_16thDec2023;

public class Lab013 {
    public static void main(String[] args) {

        //Logical Operator
        // ! , && , ||

        // ! ==> NOT Operator
        // NOT Operation is only work with  Boolean & Condition

        Boolean a = true;
        System.out.println(a);
        System.out.println(!a);
        // System.out.println(!10); //==> Not operator not work int (only boolean)

        // with condition
        System.out.println(!(10>20)); // --> true

        System.out.println(" ----- OR Operator ----");

        //|| ==> OR Operator ==> below are the OR conditions
        // true || true  ==> true
        // true || false  ==> true
        // false || true  ==> true
        // false || false  ==> false

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(" ----- AND Operator ----");

        // && ==> AND Operator ==> below are the AND conditions
        // true && true  ==> true
        // true && false  ==> false
        // false && true  ==> false
        // false && false  ==> false

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
    }
}
