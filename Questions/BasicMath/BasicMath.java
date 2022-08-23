package Questions.BasicMath;

import java.util.Scanner;

public class BasicMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter number: ");
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        float sub = num1 - num2;
        float div = num1 / num2;
        float prod = num1 * num2;
        float mod = num1 % num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + sub);
        System.out.println(num1 + " / " + num2 + " = " + div);
        System.out.println(num1 + " x " + num2 + " = " + prod);
        System.out.println(num1 + " mod " + num2 + " = " + mod);
        sc.close();
    }
}
