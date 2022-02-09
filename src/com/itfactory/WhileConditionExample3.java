package com.itfactory;

public class WhileConditionExample3 {
    /**
     * Se da un numar x = 1.
     * Se se incrementeze numarul x pana cand acesta depaseste 5.
     *
     * @param args
     */
    public static void main(String[] args) {
        int x = 1;

        while (x <= 5) {
            System.out.println("Numarul: " + x + " este mai mic sau egal cu 5");
            x++;
        }
        System.out.println("Numarul final: " + x + " este mai mare decat 5. Am iesit din bucla");
    }
}
