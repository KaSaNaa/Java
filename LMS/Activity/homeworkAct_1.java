package LMS.Activity;

import java.util.Scanner;
/* Write an object oriented application using java to perform below and upload the source file or image of the hand written program.
*Set number, units consumed for the month and unit charge of an electricity bill.
*Calculate final amount of the electricity bill. If monthly units consumed is greater than 100,increase unit charge by 2%.
*Output amount of the electricity bill.
 */

class Bill {
    private String number;
    private float units;
    private float amnt;
    public float unitPrice = 30.00f;
    Scanner sc = new Scanner(System.in);

    public void getNumber() {

        System.out.println("Enter invoice number: ");
        number = sc.next();
    }

    public void getUnits() {
        System.out.println("Enter units consumed: ");
        units = sc.nextFloat();
    }

    public void CalFinale() {

        if (units > 100) {
            unitPrice = unitPrice + (unitPrice * 0.02f);
            amnt = unitPrice * units;
        } else{
            amnt = unitPrice * units;
        }
    }

    public void ShowBill() {
        System.out.println("\n\n\t\t- - - - - - Your Invoice Number: E-Bill_ " + number + " - - - - - - ");
        System.out.printf("\nUnits used for the last month: %f\n\nAmount to be paid: Rs. %f", units, amnt);
    }

}

public class homeworkAct_1 {
    public static void main(String[] args) {
        
        Bill x = new Bill();
        x.getNumber();
        x.getUnits();
        x.CalFinale();
        x.ShowBill();

        

    }
}