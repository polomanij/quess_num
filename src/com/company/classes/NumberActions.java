package com.company.classes;

import java.util.Random;
import java.util.Scanner;

public class NumberActions {

    public int makeNumber(int max) {
        Random random = new Random();

        int randNumber = random.nextInt(20);

        return randNumber;
    }

    public int getNumber() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        return number;
    }

    public int toCompare(int first, int two) {
       if (first > two) {
           return 1;
       } else if (first < two) {
           return -1;
       } else  {
           return 0;
       }
    }
}
