package LMS.Activity;

class Employee {
    private int number;
    private float fee;
    private float income;
    private Activity a1, a2, a3;

    public Employee(int number, float fee, float a1, float a2, float a3) {
        this.number = number;
        this.fee = fee;
        this.a1 = new Activity(a1);
        this.a2 = new Activity(a2);
        this.a3 = new Activity(a3);
    }

    private float calIncome() {
        income = (a1.getHours() + a2.getHours() + a3.getHours()) * fee;
        return income;
    }

    public void showDetails() {
        System.out.println("Employee number: " + number + "\tIncome: " + calIncome());
    }

}

class Activity {
    private float hours;

    public Activity(float hours) {
        this.hours = hours;
    }

    public float getHours() {
        return hours;
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee(352, 10F, 4F, 4.5F, 1.5F);
        emp1.showDetails();
    }
}