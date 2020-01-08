package com.qa.numbers;

public class NumberCruncher {

    public int findHighestNumber(int[] input) {
        int highestNumber = input[0];

        for (int i = 1; i < input.length; i++) {
            if (input[i] > highestNumber) {
                highestNumber = input[i];
            }
        }
        return highestNumber;
    }
}
