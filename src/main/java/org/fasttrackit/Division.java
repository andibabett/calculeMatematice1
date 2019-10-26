package org.fasttrackit;

public class Division {
    double a;
    double b;


    public double div(double b){
        return div(a,b);
    }

    public double div(double a, double b) {
        double div = a / b;
        System.out.println(a + "/" + b + "=" + div);

        return div;
    }

}
