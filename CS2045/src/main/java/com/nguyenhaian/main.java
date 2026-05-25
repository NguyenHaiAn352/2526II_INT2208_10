package com.nguyenhaian;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //System.out.print("Enter the person's age: ");
        int age = reader.nextInt();
        //System.out.print("Enter the person's income: ");
        float income = reader.nextFloat();
        //System.out.print("Enter the person's credit score: ");
        int credit_score = reader.nextInt();
        //System.out.print("Enter the person's career: ");
        reader.nextLine();
        String employment = reader.nextLine();

        reader.close();

        Boolean isInputValid = checkInvalid(age, income, credit_score, employment);
        if (!isInputValid) {
            System.out.println("Invalid Input");
        } else {
            checkRules(age, income, credit_score, employment);
        }
    }

    private static Boolean checkInvalid(int age, float income, int credit_score, String employment){
        /**
         * Check if the input provided is invalid.
         * 
         * @param age: The person's age.
         * @param income: The person's income.
         * @param credit_score: The person's credit score;
         * @param employment: The person's current career;
         * @return Validity of the input.
         */
        Boolean ageFlag = false; 
        Boolean incomeFlag = false; 
        Boolean creditScoreFlag = false; 
        Boolean employmentFlag = false;

        if (18 <= age && age <= 65) {
            ageFlag = true;
        }

        if (5000000 <= income && income <= 500000000) {
            incomeFlag = true;
        }

        if (300 <= credit_score && credit_score <= 850) {
            creditScoreFlag = true;
        }

        if (employment.equals("C") || employment.equals("F")) {
            employmentFlag = true;
        }
        
        return ageFlag && incomeFlag && creditScoreFlag && employmentFlag;
    }

    private static void checkRules(int age, float income, int credit_score, String employment) {
        String risk;

        if (300 <= credit_score && credit_score <= 500) {
            risk = "HR";
        } else if (501 <= credit_score && credit_score <= 700) {
            risk = "MR";
        } else {
            risk = "LR";
        }

        if (risk.equals( "HR")) {
            System.out.println("Reject");
            return;
        }

        if (income < 15000000) {
            if (employment.equals("F") || risk.equals("MR")) {
                System.out.println("Reject");
            }
            if (employment.equals("C") && risk.equals("LR")) {
                System.out.println("Manual Review");
            }
        }

        if (income >= 15000000) {
            if (employment.equals("F")) {
                System.out.println("Manual Review");
            } else {
                System.out.println("Approve");
            }
        }
    }
}
