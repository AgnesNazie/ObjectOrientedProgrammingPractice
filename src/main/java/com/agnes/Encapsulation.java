package com.agnes;

public class Encapsulation {
    private String name;
    private int grade;
    private int age;


    public void setName(String name) {
        this.name = name;
    }

    void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("invalid Grade .");
        }
    }

    String getName() {
        return name;
    }
    void setAge(int age) {
        if (age >= 5 &&  age <= 25 ){
            this.age = age;
        } else {
            System.out.println("invalid age");
        }
    }

    int getGrade() {
        return grade;
    }
    int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Encapsulation e1 = new Encapsulation();
        e1.setName("Agnes");
        e1.setAge(4);
        e1.setGrade(0);
        System.out.println("I'm " + e1.getName() + " my grade is  " + e1.getGrade() + " and i am " + e1.getAge() + " years old");


        Encapsulation e2 = new Encapsulation();
        e2.setName("fidelis");
        e2.setAge(30);
        e2.setGrade(90);
        System.out.println("I'm " + e2.getName() + " my grade is  " + e2.getGrade() + " and i am " + e2.getAge() + " years old");


    }

}
