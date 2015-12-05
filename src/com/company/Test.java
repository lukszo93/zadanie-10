package com.company;


/**
 * Created by ced on 2015-12-05.
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita = ");
        int a = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
        }
    }
}
