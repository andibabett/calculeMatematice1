package org.fasttrackit;

public class Substraction {
    double a;
    double b;

    public void sub(double a, double b) {
        double sub = a - b;
        System.out.println(a + "-" + b + "=" + sub);
    }

    @Override
    public String toString() {
        return "Substraction{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}