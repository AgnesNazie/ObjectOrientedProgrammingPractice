package com.agnes;

public class Person {
    // created a class
    String name;
    int age;

    //create a constructor to initialize  the person field
    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    //create a methode to introduce  person and print name and age
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

class Student1 extends Person {
    String studentId;

    // create constructor for student class
    public Student1(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, ny name is " + name + " and i am " + age + " years old." + " my Student ID is " + studentId);
    }
}
class Teacher extends Person {
    String subject;

    //create constructor for teacher class
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, ny name is " + name + " and i am " + age + " years old." + " I am teaching " + subject);
    }
}
class Employee extends Person {
    String employeeID;
    String department;

    //create a constructor for the employee class
    public Employee(String name, int age, String employeeID, String department) {
        super(name , age);
        this.employeeID = employeeID;
        this.department = department;
    }
    // create @override
    @Override
    public void introduce() {
        System.out.println("Hello, ny name is " + name + " and i am " + age + " years old.");
        System.out.println("My employeeID is " + employeeID + " and I work at the " + department +  "department");
    }

public  static void main (String[] args) {
        Person person = new Person("Nazie", 29);
        person.introduce();

        Student1 student = new Student1("Agnes" , 25, "G551234");
        student.introduce();

        Teacher teacher = new Teacher("Javan", 35, "programming");
        teacher.introduce();

        Employee employee = new Employee("Simon", 34, "L1234", "Human resource");
        employee.introduce();
}

}



