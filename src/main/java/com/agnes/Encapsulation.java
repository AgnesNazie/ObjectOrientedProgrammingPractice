package com.agnes;

public class Encapsulation {
    private String name;
    private int grade;
    private int age;


    void SetName(String name) {
        this.name = name;
    }

    void SetGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("invalid Grade .");
        }
    }

    String GetName() {
        return name;
    }
    void SetAge(int age) {
        if (age >= 5 &&  age <= 25 ){
            this.age = age;
        } else {
            System.out.println("invalid age");
        }
    }

    int GetGrade() {
        return grade;
    }
    int GetAge() {
        return age;
    }

    public static void main(String[] args) {
        Encapsulation e1 = new Encapsulation();
        e1.SetName("Agnes");
        e1.SetAge(4);
        e1.SetGrade(0);
        System.out.println("I'm " + e1.GetName() + " my grade is  " + e1.GetGrade() + " and i am " + e1.GetAge() + " years old");


        Encapsulation e2 = new Encapsulation();
        e2.SetName("fidelis");
        e2.SetAge(30);
        e2.SetGrade(90);
        System.out.println("I'm " + e2.GetName() + " my grade is  " + e2.GetGrade() + " and i am " + e2.GetAge() + " years old");


    }

}
