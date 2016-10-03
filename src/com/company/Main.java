package com.company;

import com.company.classes.NumberActions;
import com.company.classes.Printer;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberActions numberActions = new NumberActions();
        Printer printer = new Printer();

        int answer, tryAmount = 3;

        do {

            for (int i = 0; i < tryAmount; i++) {

                int maxRandomNumber = 20;

                int random = numberActions.makeNumber(maxRandomNumber);

                printer.print("Please enter number from 1 to 20. You have try: " + tryAmount);

                int customerNumber = numberActions.getNumber();

                if ( numberActions.toCompare(random, customerNumber) == 0 ) {
                    printer.print("You`re right!!");
                } else {
                    printer.print("It`s wrong.");
                }

            }



            Scanner scanner = new Scanner(System.in);

            printer.print("Do you want to play again? 1. - YES; 2. - NO");

            answer = scanner.nextInt();
        } while (answer == 1);

    }
}
