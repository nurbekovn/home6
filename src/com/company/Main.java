package com.company;
//     FOR
//1ден 10го чейинки сан алыныз. Ал сандын факториалын консольго чыгарып бериниз.
//        Мисалы:
//        5
//        Жооп:
//        120
//        n санынын факториалы - 1 ден n ге чейинки сандардын кобойтуусу
//        n! = 1 * 2...n
//        3! = 1 * 2 * 3 = 6
//        4! = 1 * 2 * 3 * 4 = 24
//        5! = 1 * 2 * 3 * 4 * 5 = 120
public class Main {

    public static void main(String[] args) {
	// write your code here
        int san =1;
        for (int i = 1; i <= 10; i++) {
         san = san*i;
            System.out.print(i + " * ");
        }
        System.out.println("= "+san);
    }
}