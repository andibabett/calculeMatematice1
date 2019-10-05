package org.fasttrackit;

public class Multiplication {
    double a;
    double b;


    public void multi(double a, double b) {
        double multi = a * b;
        System.out.println(a + "*" + b + "=" + multi);
    }


    @Override
    public String toString() {
        return "Multiplication{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
