package InputScanners;

import java.util.Scanner; //imports the Scanner class which is defined inside util folder inside the java folder.

public class input {
    public static void main(String[] args) {

        System.out.println("Enter text: ");
        Scanner sc = new Scanner(System.in); // system.in is just a another scanner. there are many types of scanners.
        // takes input from user and stores it in a Scanner Variable called "sc".
        // Scanner is a class in java. util package used for obtaining the input of the
        // primitive types like int, double, etc. and strings.
        // It is the easiest way to read input in a Java program, though not very
        // efficient.

        String scanned = sc.next(); // this stores the taken input in a string variable called "scanned".
        System.out.println("Enter number: ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        // string to integer conversion
        System.out.println("Enter anything: ");
        Scanner thing = new Scanner(System.in);
        String THING = thing.next();
        int x = Integer.parseInt(THING);

        System.out.println(scanned);
        System.out.println(number);
        System.out.println(x);
        // 38:42

    }
}
