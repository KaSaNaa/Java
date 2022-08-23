package Questions.DivideNums;

import java.util.Scanner;

public class DivNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        float num1 = sc.nextInt();
        System.out.print("Enter number : ");
        float num2 = sc.nextInt();
        sc.close();
        float div = num1 / num2;
        System.out.print(div);

    }
}
