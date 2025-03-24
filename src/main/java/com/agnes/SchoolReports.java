package com.agnes;

public class SchoolReports {
    public static void main(String[] args ) {
        Student s1 = new Student();
        s1.name = "Agnes";
        s1.mathScore = 90;
        s1.englishScore = 90;
        s1.totalScores();

        Student s2 = new Student();
        s2.name = "Fidelis";
        s2.mathScore = 90;
        s2.englishScore = 80;
        s2.totalScores();
    }
}
