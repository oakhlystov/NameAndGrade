package org.example;

public class DefineGrade {
    public String defineGradeByPoints(int points) {
        String grade;
        if (points >= 97) {
            grade = "A+";
        } else if (points >= 93) {
            grade = "A";
        } else if (points >= 90) {
            grade = "A-";
        } else if (points >= 87) {
            grade = "B+";
        } else if (points >= 83) {
            grade = "B";
        } else if (points >= 80) {
            grade = "B-";
        } else if (points >= 77) {
            grade = "C+";
        } else if (points >= 73) {
            grade = "C";
        } else if (points >= 70) {
            grade = "C-";
        } else if (points >= 67) {
            grade = "D+";
        } else if (points >= 65) {
            grade = "D";
        } else {
            grade = "D-";
        }
        return grade;
    }
}
