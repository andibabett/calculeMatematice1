package org.fasttrackit;

import java.util.Scanner;


//public class App {
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
//
//
//    Summary summary = new Summary();
//
//    Substraction subtraction = new Substraction();
//
//    Multiplication multiplication = new Multiplication();
//}

public class App {
    public static void main(String[] args) {

        System.out.println("Dati numerele a si b");
        System.out.print(" a= ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();

        System.out.print(" b= ");
        double b = in.nextDouble();

        Summary summary = new Summary();
        Substraction substraction = new Substraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();
        summary.sum(a,b);
        substraction.sub(a,b);
        multiplication.multi(a,b);
        division.div(a,b);


    }

}


