package org.fasttrackit;

public class Summary {
    double a;
    double b;


    public void sum(double a, double b) {
        double sum = a + b;
        System.out.println(a + "+" + b + "=" + sum);
    }

    @Override
    public String toString() {
        return "Summary{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

}
