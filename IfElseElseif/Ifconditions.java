package IfElseElseif;

import java.util.Scanner;

public class Ifconditions {
    public static void main(String[] args) {
        System.out.println("Enter name: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.equals("tim")) {
            System.out.println("You typed tim");
        } else if (s.equals("Pasi")) {
            System.out.println("You entered Pasi.");
        } else {
            System.out.println("You didn't enter tim.");
        }

        System.out.print("Enter your age: ");

        int age = sc.nextInt();
        sc.close(); // scannerVariable.close(); is used to close intput stream. if not IDE will show
                    // a resource leak.

        if (age > 20) {
            System.out.print("You can ride bike.");
        } else if (age > 15) {
            System.out.print("You need to train more.");
        } else if (age > 10) {
            System.out.print("Grow up kid!");
        } else {
            System.out.print("Stay home please!");
        }

    }
}
