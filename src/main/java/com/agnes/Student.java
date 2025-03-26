package com.agnes;

public class Student {
    //Exercise 1:
    //Create a class Student with attributes:name and favoriteSubject

    String name;
    String favouriteSubject;
    String hobby;
    int marks;
    int mathScore;
    int englishScore;
    int sum;
    int totalScores;

    //Create a method study() that prints:
    //“[name] is studying [favoriteSubject].
    void study() {
        System.out.println("I'm " + name + " and I'm studying " + favouriteSubject + ".");
    }

    void checkPass() {
        if (marks >= 50) {
            System.out.println(name + " passed");
        } else {
            System.out.println(name + " failed");
        }
    }
    void doHobby() {
        System.out.println(name + " Loves to " + hobby);
    }
    void totalScores() {
        sum = mathScore + englishScore;
        System.out.println (name + " total score is " + sum);
    }
}

