package ClassroomActivities;

import java.util.Scanner;

public class SalMain {
    public static void main(String[] args) {
        float incrSal = 0;
        float x = 0;
        String[] employees = new String[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < employees.length; i++) {

            System.out.println("Enter the type of employee: ");
            employees[i] = sc.next();

            System.out.print("Enter basic salary: ");
            float Salary = sc.nextFloat();

            switch (employees[i]) {
                case "A":
                    incrSal = Salary * 0.03f;
                    break;
                case "B":
                    incrSal = Salary * 0.05f;
                    break;
                case "C":
                    incrSal = Salary * 0.06f;
                    break;
                default:
                    System.out.println("Invalid type entered");
                    break;
            }
            x = x + incrSal;

        }
        System.out.print("Total increment amount given: " + x);
        sc.close();

    }

}
