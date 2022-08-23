package ConditionsAndBooleans;

public class CondandBool {
    public static void main(String[] args) {
        int x = 6;
        int y = 7;
        int z = 8;

        String s = "Pasindu";
        String k = "Pasindu";

        // > < == >= <= !=
        boolean compare = x < y;
        boolean c = x > y;
        boolean d = x != y;
        boolean g = z >= x;
        boolean j=  x < y && y > z || (z + 2 < 5 || x + 7 > z);

        s.equals(k); // var.equals(another var); is used to compare two Strings.


        System.out.println(compare);
        System.out.println(c);
        System.out.println(d);
        System.out.println(g);
        System.out.println(j);
        System.out.println(s.equals(k));
        // 41:46

    }
}
