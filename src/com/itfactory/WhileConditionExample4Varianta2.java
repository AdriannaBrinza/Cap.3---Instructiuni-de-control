package com.itfactory;

import java.util.Random;

public class WhileConditionExample4Varianta2 {
    /**
     * Se cere sa se creeze o bucla while prin care se genereaza cate un numar randon intre 1 si 10 la fiecare iteratie.
     * In momentul in care s-a generat 5 se va iesi din bucla.
     *
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(10 + 1);

        while (true) {
            if (x == 5) {
                System.out.println("Numarul generat este: " + x + ". Asadar, am iesit din bucla");
                //Acest break folosit in bucle ma ajuta ca la un momentdat sa inchid bucla. in acest caz, in momentul in care am generat 5, am iesti din bucla.
                break;
            }
            System.out.println("Numarul generat random este: " + x);
            x = random.nextInt(10 + 1);
        }
    }
}
