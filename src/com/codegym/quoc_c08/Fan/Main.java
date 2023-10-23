package com.codegym.quoc_c08.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println(fan1);

        fan2.setSpeed(2);
        fan2.setColor("blue");
        fan2.setRadius(10);
        fan2.setOn(false);
        System.out.println(fan2);


    }
}
