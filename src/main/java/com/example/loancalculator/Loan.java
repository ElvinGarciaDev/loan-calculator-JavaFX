package com.example.loancalculator;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    // Default constructor
    public Loan(){};

    /* construct a loan with specified annual interest rate,
       number of years, and loan amount */
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    //*****************
    // Getters
    //*****************

    // Return annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    // Return numberOfYears
    public int getNumberOfYears() {
        return numberOfYears;
    }
    // Return loanAmount
    public double getLoanAmount() {
        return loanAmount;
    }
    // Return loan date
    public java.util.Date getLoanDate() {
        return loanDate;
    }

    //*****************
    // Setters
    //*****************

    // Set AnnualInterestRate
    public void setAnnualInterestRate(double AnnualInterestRate) {
        this.annualInterestRate = AnnualInterestRate;
    }
    // Set numberOfYears
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
    // Set loan amount
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    //*****************
    // Calculations
    //*****************

    // Find monthly payment
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    // Find total payment
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
}
