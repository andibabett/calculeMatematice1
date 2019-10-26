package org.fasttrackit;

public class Summary {
    double a;
    double b;


    public double sum(double a){
        return sum(a,6.6);
    }


    public double sum(double a, double b) {
        double sum = a + b;
        System.out.println(a + "+" + b + "=" + sum);
        return sum;
    }


}
