package com.codegym.quoc_c08.QuadraticEquation;

import java.util.Scanner;

public class roots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();
        System.out.println("Enter c");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double r1 = quadraticEquation.getRoot1();
        double r2 = quadraticEquation.getRoot2();
        if (quadraticEquation.getDiscriminant() >= 0) {
            System.out.println("roots 1 is :" + r1);
            System.out.println("roots 2 is :" + r2);
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("double root" + r1);
        } else {
            System.out.println("“The equation has no roots”");
        }
    }
}