// Created by Kayne Uriel Rodrigo
// FECP 5 - 1005 Lab 2

package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        String membershipStatus = sc.nextLine();


        if (!(membershipStatus.equalsIgnoreCase("Regular") || membershipStatus.equalsIgnoreCase("VIP") || membershipStatus.equalsIgnoreCase("Premium"))) {
            System.out.println("Invalid membership status entered.");
            return;
        }

        System.out.print("Enter age: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid age entered. Please enter a number.");
            sc.close();
            return;
        }
        int userAge = sc.nextInt();
        sc.nextLine();


        float subscriptionPricing = 0.0f;

        if(membershipStatus.equalsIgnoreCase("Regular") ) {
            if(userAge < 18) subscriptionPricing = 50.0f;
            else if(userAge <= 64) subscriptionPricing = 100.0f;
            else subscriptionPricing = 75.0f;
        }
        else if(membershipStatus.equalsIgnoreCase("VIP") ) {
            if(userAge < 18) subscriptionPricing = 75.0f;
            else if(userAge <= 64) subscriptionPricing = 150.0f;
            else subscriptionPricing = 112.5f;
        }
        else if(membershipStatus.equalsIgnoreCase("Premium") ) {
            if(userAge < 18) subscriptionPricing = 100.0f;
            else if(userAge <= 64) subscriptionPricing = 200.0f;
            else subscriptionPricing = 150.0f;
        }

        // Output
        System.out.printf("Price: $%.2f%n", subscriptionPricing);

    }

}