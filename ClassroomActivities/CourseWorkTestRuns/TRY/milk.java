package ClassroomActivities.CourseWorkTestRuns.TRY;

class Milk{
    // buys milk from farmers
    private float price, totalCost;
    private String gradeOfMilk;

    public float calculateTotalCost() {
        return totalCost;
    }

    public float getprice() {
        return price;
    }

    public String getMilkGrade() {
        return gradeOfMilk;
        
    }
}

class HQmilk extends Milk{

}

class MQmilk extends Milk{

}

class LQMilk extends Milk{

}

class IceCream {
    private String flavour;
    private float qty; // Qunatity Made
    private float totInc;

    public float TotalIncome() {
        return totInc;
    }

}

class Chocolate extends IceCream{

}

class Vanilla extends IceCream{

}

class Strawberry extends IceCream {
    
}

class Main{
    public static void main(String[] args) {
        // calculate net income
    }

}