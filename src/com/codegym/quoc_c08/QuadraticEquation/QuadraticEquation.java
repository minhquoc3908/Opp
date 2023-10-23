package com.codegym.quoc_c08.QuadraticEquation;

public class QuadraticEquation {
    private double a,b,c;
    private double delta,r1,r2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return delta=b*2-4*a*c;
    }
    public double getRoot1(){
        return r1=-b+Math.sqrt(b*b-4*a*c)/2*a;
    }
 public double getRoot2(){
        return r2=-b-Math.sqrt(b*b-4*a*c)/2*a;
 }
}
