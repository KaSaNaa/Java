package Questions.AreaPerimCircle;

import java.util.Scanner;

public class AreaPermCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = sc.nextFloat();
        sc.close();
        float perim = (44/7)*radius;
        double area = 3.14*radius*radius;
        System.out.print("Perimeter of circle is " + perim + "." + "\n" + "Area of circle is " + area + ".");
        

    }
}
