package Questions.ProductofNums;

import java.util.Scanner;

public class NumProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter number: ");
        float num2 = sc.nextFloat();
        float prod = num1*num2;
        System.out.print(prod);
        sc.close();
    }
    
}
