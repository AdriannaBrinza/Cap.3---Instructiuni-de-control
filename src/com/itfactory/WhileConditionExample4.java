package com.itfactory;

import java.util.Random;

public class WhileConditionExample4 {
    /**
     * Se cere sa se creeze o bucla while prin care se genereaza cate un numar random intre 1 si 10 la fiecare iteratie.
     * In momentul in care s-a generat 5 se va iesi din bucla.
     *
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(10 + 1);
        System.out.println("Primul numar generat random este: " + x);

        while (x != 5) {
            x = random.nextInt(10 + 1);
            System.out.println("Urmatorul numar generat random este: " + x);
            if (x == 5) {
                //Acest break folosit in bucle ma ajuta ca la un momentdat sa inchid bucla. in acest caz, in momentul in care am generat 5, am iesti din bucla.
                break;
            }
        }
        System.out.println("Am iesit din bucla pentru ca numarul generat random a fost: " + x);
    }
}
