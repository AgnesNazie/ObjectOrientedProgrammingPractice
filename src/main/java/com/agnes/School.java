package com.agnes;

public class School {

    public static void main(String[] args) {
        //Create 3 students in the School class, assign different names and grades,
        // and call introduce() for each one.

        // create a student object by calling the student method
        Student s1 = new Student();
        s1.name = "Agnes";
        s1.favouriteSubject = "english";
        s1.marks = 45;
        s1.study();
        s1.checkpass();

        Student s2 = new Student();
        s2.name = "Javan";
        s2.favouriteSubject = "IT";
        s2.marks = 90;
        s2.study();
        s2.checkpass();

        Student s3 = new Student();
        s3.name = "Simon";
        s3.favouriteSubject = "Computer";
        s3.marks = 89;
        s3.study();
        s3.checkpass();

    }
}

