package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Principal: "); // ask the user to enter the principal amount
        int principal = scanner.nextInt();//store as variable principal

        System.out.print("Annual Interest Rate: "); //ask the user to enter their interest rate as float or double
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR; //divide by 12 to get float value //store as variable monthlyInterest

        System.out.print("Period (Years): ");//ask the user to enter the length of the loan in years
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR; //multiply by 12 for number of months //store as variable paymentCount

        double mortgage = principal //calculate the mortgage payment
            * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
            //store as variable mortgagePayment

        System.out.println("Monthly Interest Rate: " + monthlyInterest);//output "Monthly interest rate: " as percentage
        System.out.println("Number of payments in the loan: " + numberOfPayments);//output "Number of payments in the loan: " as integer
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);//output "Mortgage: " as currency
    }

}
