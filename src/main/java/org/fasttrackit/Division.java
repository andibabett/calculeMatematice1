package org.fasttrackit;

public class Division {
    double a;
    double b;

    public void div() {

    }

    {
        double div = a/b;
        System.out.println(a + "/" + b + "=" + div);
    }

    @Override
    public String toString() {
        return "Division{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
