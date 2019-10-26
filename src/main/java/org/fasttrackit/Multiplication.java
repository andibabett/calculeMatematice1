package org.fasttrackit;

public class Multiplication {
    double a;
    double b;


    public double multi(double b){
        return multi(3.2, b);
    }

    public double multi(double a, double b) {
        double multi = a * b;
        System.out.println(a + "*" + b + "=" + multi);
        return multi;
    }



}
