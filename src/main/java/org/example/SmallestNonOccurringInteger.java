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

    public static void main(String[] args) {

        Integer[] array1 = {1, 3, 6, 4, 1, 2};
        Integer[] array2 = {5, -1, -3};
        Integer[] array3 = {1, 2, 3, 3, 5, 6};

        int smallest1 = findSmallestNonOccurringInteger(array1);
        int smallest2 = findSmallestNonOccurringInteger(array2);
        int smallest3 = findSmallestNonOccurringInteger(array3);

        System.out.println("Smallest non-occurring integer in Array1: " + smallest1);
        System.out.println("Smallest non-occurring integer in Array2: " + smallest2);
        System.out.println("Smallest non-occurring integer in Array3: " + smallest3);
    }

}
