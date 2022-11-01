package ClassroomActivities.CourseWorkTestRuns.TRY;

import java.util.Scanner;

class Milk {
    // buys milk from farmers
    protected float price, ltrs, creamQty, totalCost;
    protected char gradeOfMilk;

    private void calculateTotalCost() {
        totalCost = price * ltrs;
    }

    float getPrice() {
        return price;
    }

    void setLtrs(float ltrs) { // to get litres of milk from the user
        this.ltrs = ltrs;
    }

    float getLtrs() {
        return ltrs;
    }

    float getCreamQty() {
        return creamQty;
    }

    float getCost() {
        return totalCost;
    }

    char getGrade() {
        return gradeOfMilk;
    }
}

class HQmilk extends Milk {
    /*
     * need to make an constructor in order to inherit instances from the parent
     * class
     */
    public HQmilk() {
        price = 750; // sets price per litre for the specified milk type
        creamQty = 2; // ice cream qty per milk ltr
        gradeOfMilk = 'A';
    }
}

class MQmilk extends Milk {
    public MQmilk() {
        price = 600;
        creamQty = 1.5f;
        gradeOfMilk = 'B';
    }
}

class LQMilk extends Milk {
    public LQMilk() {
        price = 500;
        creamQty = 1;
        gradeOfMilk = 'C';
    }
}

class IceCream {
    protected char flavour;
    protected float qtyMade, sellingPrice; // Qunatity Made
    protected float totInc = 0;
    protected Milk milk;

    private void calQty() {
        qtyMade = milk.getLtrs() * milk.getCreamQty();

    }

    public void calIncome() {
        calQty();
        totInc = qtyMade * sellingPrice;

    }

    public void produceReport(Milk m) {
        milk = m;
        calIncome();
        System.out.println("\t\t-----R e p o r t-----\t\t");
        System.out.println(null);
    }

}

class Chocolate extends IceCream {
    public Chocolate() {
        pricePerLtr = 1500;
        flavour = 'C';
    }

}

class Vanilla extends IceCream {
    public Vanilla() {
        pricePerLtr = 1000;
        flavour = 'V';
    }

}

class Strawberry extends IceCream {
    public Strawberry() {
        pricePerLtr = 1200;
        flavour = 'S';
    }
}

/*
 * Take milk quantity bought, grade of milk and the flavor of ice-cream as
 * inputs and Calculate
 * i. The total expenses of the company for that sale,
 * ii. Total Income company obtained by that sale
 * iii. Net profit from that sale.
 */

class Main {
    public static void main(String[] args) {
        // calculate net income
        Scanner sc = new Scanner(System.in);
        Milk x = new Milk();

        System.out.println("Enter milk type (High/Medium/Low) : ");
        String type = sc.next();

        sc.close();
    }

}