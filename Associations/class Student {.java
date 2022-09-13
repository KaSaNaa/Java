package Associations;

class Student {
    private String name;
    Module m1; // module class object created inside student class.
    public Student(String name){
        this.name = name;
        m1 = new Module(30); // Association
    }
    public void showDetails(){
        System.out.println("Name is " + name);
        // System.out.println("Module duration =" + duration);
        // (this line won't work as duration is a private attribute in another class)
        System.out.println("Module duration is " + m1.getDuration() );
    }
} 
class Module{
    private int duration;
    public Module(int duration){
        this.duration = duration; // Association
    }
    public int getDuration(){
        return duration;
    }
    
}
class Main{
    public static void main(String[] args) {
        Student s1 = new Student("Pasindu");
        s1.showDetails();

    }
}