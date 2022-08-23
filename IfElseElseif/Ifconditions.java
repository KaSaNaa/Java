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

    }
}
