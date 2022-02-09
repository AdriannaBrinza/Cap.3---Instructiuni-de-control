package com.itfactory;

import java.util.Scanner;

public class IfConditionExample1 {
    /**
     * Se citeste un numar de la tastatura. Sa se afiseze un mesaj afirmativ daca numarul este mai mare ca 10
     * In caz contrar se va afisa un mesaj negativ.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati numarul pentru care se face verificarea ");
        int numar = Integer.valueOf(scanner.nextLine());

        if (numar > 10) {
            System.out.println("Numarul " + numar + " este mai mare ca 10");
        } else {
            System.out.println("Numarul " + numar + " este mai mic decat 10");
        }
    }
}
