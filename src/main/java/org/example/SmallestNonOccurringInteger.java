package org.example;

import java.util.Arrays;

public class SmallestNonOccurringInteger {

    public static int findSmallestNonOccurringInteger(Integer[] array) {
        Arrays.sort(array);
        int smallestNonOccurring = 1;

        for (int number : array) {
            if (number <= 0) {
                continue;
            }
            if (number <= smallestNonOccurring) {
                smallestNonOccurring = number + 1;
            } else {
                break;
            }
        }

        return smallestNonOccurring;
    }
}

