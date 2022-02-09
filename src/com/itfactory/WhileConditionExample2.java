package com.itfactory;

import java.util.Random;

public class WhileConditionExample2 {
    /**
     * Se se genereze numere intr-o bucla, intre 0 si 100 pana cand numarul este mai mic decat 50
     *
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(100 + 1);
        System.out.println(x);

        while (x >= 50) {
            System.out.println("S-a generat numarul: " + x + ". Continua bucla");
            x = random.nextInt(100 + 1);
        }

        System.out.println("S-a generat numarul: " + x + ". Am iesit din bucla");
    }
}
