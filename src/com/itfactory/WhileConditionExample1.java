package com.itfactory;

import java.util.Scanner;

public class WhileConditionExample1 {
    /**
     * Sa se citeasca de la tastatura numere pana la introducerea numarului 0.
     * Se cere sa se foloseasca bucla while.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("introdu numarul: ");
        int x;

        while ((x = scanner.nextInt()) != 0) {
            System.out.println("Am citit: " + x);
            System.out.print("Introdu numarul: ");
        }
        System.out.println("S-a introdus numarul 0. Ies din bucla");
    }

}

