package com.itfactory;

import java.util.Scanner;
import java.lang.*;

/*Sa se verifice daca 3 numere citite de la tastatura verifica inegalitatea laturilor intr-un triunghi. Afisati un mesaj afirmativ sau negativ.
Inegalitatea triunghiului afirmă că pentru orice triunghi, suma lungimilor oricăror două laturi trebuie să fie strict mai mare decat
lungimea laturii rămase. In plus, o latură trebuie să fie mai mare ca modulul diferenței celorlalte 2 laturi.*/
public class VerificareInegalitateTriunghi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dati lungimea laturii a: ");
        int a = scanner.nextInt();
        while (a <= 0) {
            System.out.println("Va rugam furnizati o valoare pozitiva pentru latura a: ");
            a = scanner.nextInt();
        }

        System.out.println("Dati lungimea laturii b: ");
        int b = scanner.nextInt();
        while (b <= 0) {
            System.out.println("Va rugam furnizati o valoare pozitiva pentru latura b: ");
            b = scanner.nextInt();
        }

        System.out.println("Dati lungimea laturii c: ");
        int c = scanner.nextInt();
        while (c <= 0) {
            System.out.println("Va rugam furnizati o valoare pozitiva pentru latura c: ");
            c = scanner.nextInt();
        }

        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a) && (Math.abs(a - b) < c) && (Math.abs(a - c) < b) && (Math.abs(b - c) < a)) {
            int perimetru = (a + b + c);
            System.out.println("Numerele furnizate pot constitui laturile unui triunghi, iar perimetrul acestuia este: " + perimetru);
        } else if (((a + b) == c) || ((a + c) == b) || ((b + c) == a)) {
            System.out.println("Triungiul este degenerat");
        } else {
            System.out.println("Numerele date nu pot forma un triunghi");
        }
    }
}
