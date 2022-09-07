package ClassroomActivities.PracticalGuide;

import java.util.Scanner;

class Student {
    private String Studentname;
    private int age;
     

    public Student(String nm, int ag) {
        this.Studentname = nm;
        this.age = ag;

    }

    public void display() {
        System.out.println("Student name is " + this.Studentname + "\n Student age is " + this.age);
    }
}

class STMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = in.next();

        System.out.print("\nEnter age: ");
        int age = in.nextInt();

        Student x = new Student(name, age);
        x.display();
        in.close();
    }
}