package LMS;

import java.util.Scanner;

class Bill {
    protected float unitCons, unitCharge, AmtToBePaid;

    public Bill(float unitCons, float unitCharge) // set values
    {
        this.unitCons = unitCons;
        this.unitCharge = unitCharge;
    }

    public void calculateBill() {
        AmtToBePaid = unitCons * unitCharge;
    }
}

class Waterbill extends Bill {
    private float taxFee, waterBillAmt;

    public Waterbill(float taxFee, float unitCons, float unitCharge) {
        super(unitCons, unitCharge);
        this.taxFee = taxFee;
    }

    public void calculateBill() // method overriding
    {
        waterBillAmt = (unitCharge * unitCons) + taxFee;
    }

    public void ShowBill() {
        System.out.println("Amount to be paid for this time of period : Rs. " + waterBillAmt);
    }

}

class WaterMain {
    public static void main(String[] args) {
        float unitCons, unitCharge, tax;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Units Consumed: ");
        unitCons = sc.nextFloat();

        System.out.print("Enter Tax Amount: ");
        tax = sc.nextFloat();
        
        System.out.print("Enter Charge per unit: ");
        unitCharge = sc.nextFloat();

        Waterbill w1 = new Waterbill(tax, unitCons, unitCharge);
        w1.calculateBill();
        w1.ShowBill();

        System.out.print("Enter Units Consumed: ");
        unitCons = sc.nextFloat();

        System.out.print("Enter Tax Amount: ");
        tax = sc.nextFloat();

        System.out.print("Enter Charge per unit: ");
        unitCharge = sc.nextFloat();

        Waterbill w2 = new Waterbill(tax, unitCons, unitCharge);
        w2.calculateBill();
        w2.ShowBill();
        
        sc.close();
    }
}
