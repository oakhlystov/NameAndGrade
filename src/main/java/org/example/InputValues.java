package org.example;

import java.util.Scanner;

public class InputValues {
    public String inputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print a name: ");
        return scanner.nextLine();
    }

    public int inputPoints() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print points (0-100): ");
        return scanner.nextInt();
    }
}
