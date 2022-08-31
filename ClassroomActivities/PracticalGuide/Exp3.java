package ClassroomActivities.PracticalGuide;



class Student{
    int rollno;
    String name;
    static String college = "ITS"; // static variable
    // constructor

    Student(int r, String n){
        rollno= r;
        name = n;
    }
    //method to display the values
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
    public class TestStaticVariable1{
        public static void main(String args[]){

            Student s1 = new Student(111, "Karan");
            Student s2 = new Student(222, "Aryan");
            // We can change the college of all objects by the single line of code
            // Student.college= "BBDIT";
            s1.display();
            s2.display();
        }
    }
}