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
    String subject;

    // create constructor for student class
    public Student1(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, ny name is " + name + " and i am " + age + " years old." + " I am studying " + subject);
    }

public  static void main (String[] args) {
        Person person = new Person("Nazie", 29);
        person.introduce();

        Student1 student = new Student1("Agnes" , 25, "programming");
        student.introduce();
}

}



