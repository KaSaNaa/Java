# Model Paper 01

##  Question 1


**A. Briefly explain “object-oriented programming”. (3 Marks).**
```java
// Writing programs to represent real world entities.
```

**B. Differentiate Class and Object. (3 Marks)**

```java
// A class defines object properties. An object is a member or an "instance" of a class.
```

**C. List out main four object-oriented features. (4 Marks)**
```java
// Inheritance, Polymorphism, Method Overriding, Objects, Classes
```
**D. Differentiate IS-A and HAS-A relationship (4 Marks)**


**E. List out benefits of inheritance in object-oriented programming. (3 Marks)**
```java
// code reusability, saves time and effort, provides clear model, leads to less development and maintenance tools.
```

**F. Why constructor is important in object-oriented programming. (3 Marks)**
```java
// Constructor is a special method which is used  to intialize the object with the default or initial state.
```

## Question 2

**A. Briefly explain the implementation of Encapsulation. (2 Marks)**

```java
// Encapsulation is one of the core concepts in object-oriented programming and describes the bundling of data and methods operating on this data into one unit. It is often used to implement an information-hiding mechanism.
```
**B. What is the output of the following program? Explain your observations. (3 Marks)**
``` java
// this won't run as the String name is private and it can be only accessible in its own class.
class Student
{ private String name;
}
    public class driverClass
    { public static void main (String args [])
        { Student student_1=new Student();
        student_1.name=”Amal”;
        System.out.println(student_1.name);
}
}
```
