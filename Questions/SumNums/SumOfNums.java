package Questions.SumNums;

import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Ente number: ");
        int num2 = sc.nextInt();
        sc.close();
        int sum = num1+num2;
        
        System.out.print("Total is ");
        System.out.print(sum);
    }
}
