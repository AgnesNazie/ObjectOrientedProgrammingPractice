package com.agnes;

public class Encapsulation {
    private String name;
    private int grade;


    void SetName(String name) {
        this.name = name;
    }

    void SetGrade(int g) {
        if (g >= 0 && g <= 100) {
            grade = g;
        } else {
            System.out.println("invalid Grade .");
        }
    }

    String GetName() {
        return name;
    }

    int GetGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Encapsulation e1 = new Encapsulation();
        e1.SetName("Agnes");
        e1.SetGrade(85);
        System.out.println("I'm " + e1.GetName() + " my grade is  " + e1.GetGrade());


    }

}
