package ClassroomActivities;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        int i = 0;
        double sum = 0;

        double[] rainfall = new double[5];

        Scanner sc = new Scanner(System.in);

        while (i <= 4) {
            System.out.print("Enter rainfall value : ");
            rainfall[i] = sc.nextDouble();
            sum = sum + rainfall[i];
            i++;
        }
        sc.close();

        double max = rainfall[0];
        double mini = rainfall[0];

        for (i = 1; i < rainfall.length; i++) {
            if (rainfall[i] > max)
                max = rainfall[i];

            if (rainfall[i] < mini)
                mini = rainfall[i];
        }
        System.out.print("\nMaximum rainfall value is " + max);

        System.out.print("\nMinimum rainfall value is " + mini);

        System.out.print("\nAverage rainfall is " + sum / i);

    }

}
