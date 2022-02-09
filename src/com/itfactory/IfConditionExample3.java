package com.itfactory;

import java.util.Random;

public class IfConditionExample3 {
    /**
     * Vreau sa verific daca un numar este intre 1 si 25, intre 25 si 50, intre 50 si 75 sau intre 75 si 100
     * 1.....25......50......75.....100 ?
     */
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        System.out.println("Numarul random este: " + randomInt);

        if (randomInt >= 50) {
            if (randomInt >= 75) {
                System.out.println(randomInt + " se afla in intervalul 75-100");
            } else {
                System.out.println(randomInt + " se afla in intervalul 50-74");
            }

        } else {
            if (randomInt >= 25) {
                System.out.println(randomInt + " se afla in intervalul 25-49");
            } else {
                System.out.println(randomInt + " se afla in intervalul 0-24");
            }

        }
    }

}
