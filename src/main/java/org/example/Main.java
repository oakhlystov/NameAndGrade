package org.example;

public class Main {
    public static void main(String[] args) {
        InputValues iv = new InputValues();
        CheckInput ci = new CheckInput();
        DefineGrade dg = new DefineGrade();
        OutputResult or = new OutputResult();

        String name = iv.inputName();
        int points = iv.inputPoints();
        ci.checkInputCall(points);
        String grade = dg.defineGradeByPoints(points);
        or.printResult(name, grade);
    }
}