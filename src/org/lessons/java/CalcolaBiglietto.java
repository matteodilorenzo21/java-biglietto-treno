package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double pricePerKm = 0.21;
        double discountUnder = 0.8;
        double discountOver = 0.6;

        System.out.println("Distanza da percorrere: ");
        double distanceKm = in.nextDouble();

        System.out.println("Età del passeggero: ");
        int age = in.nextInt();

        double totalPrice = pricePerKm * distanceKm;

        if (age < 18) {
            totalPrice *= discountUnder;
        } else if (age >= 65) {
            totalPrice *= discountOver;
        }
        

        System.out.print("Il prezzo totale del viaggio è: ");
        System.out.printf("%.2f", totalPrice);
        System.out.print("€");

    }
}


