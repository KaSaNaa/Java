package Questions.printHello;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner NM = new Scanner(System.in);
        String name = NM.next();
        System.out.print("Hello ");
        System.out.println(name);
        NM.close();
    }
}
