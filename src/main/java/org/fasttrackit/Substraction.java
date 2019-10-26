package org.fasttrackit;

public class Substraction {
    double c;
    double d;



    public double sub(double a){
        return sub (a, 3.9);
    }

    public double sub(double a, double b) {
        double sub = a - b;
        System.out.println(a + "-" + b + "=" + sub);
        return sub;
    }

}