package ClassroomActivities.CourseWorkTestRuns.CW2;

import java.util.Scanner;

class Product {
    protected String productName;
    protected float unitPrice;
    protected float taxRate;

    public Product(String name, float unitPrice, float taxRate) {
        this.productName = name;
        this.unitPrice = unitPrice;
        this.taxRate = taxRate;
    }

    protected String getProductName() {
        return productName;
    }

    protected float getunitPrice() {
        return unitPrice;
    }

    protected float gettaxRate() {
        return taxRate;
    }
}

class ImportedProduct extends Product {
    public ImportedProduct(String name, float unitPrice, float taxRate) {
        super(name, unitPrice, taxRate);
    }
}

class Customer {
    protected String custm_ID;
    protected float totalSales;
    int prodcut01Qty = 0;
    int prodcut02Qty = 0;
    
    public Customer(String ID, int qtyBought1, int qtyBought2) {
        this.custm_ID = ID;
        this.prodcut01Qty = qtyBought1;
        this.prodcut02Qty = qtyBought2;
    }

    public float calculateBill() {
        totalSales = 

    
    }

    public void displayBill() {
        System.out.println(custm_ID);
        System.out.print(custm_ID);
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}