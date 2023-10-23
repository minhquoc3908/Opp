package com.codegym.quoc_c08.Fan;

public class Fan {
    private final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int Speed = SLOW;
    private boolean isOn = false;
    private double radius;
    private String color;

    public Fan() {
    }
    public void setSpeed(int speed) {
        Speed = speed;
    }
    public void setOn(boolean on) {
        isOn = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        if (isOn) {
            return "Speed: " + Speed + ", Radius:" + radius + ", color " + color + ", Fan is on ";
        } else {
            return "color " + color + ", radius: " + radius + ", fan is off";
        }
    }
}

