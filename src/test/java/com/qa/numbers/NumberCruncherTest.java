package com.qa.numbers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberCruncherTest {

    @Test
    public void find_highest_number_in_array_of_one() {
        //arrange
        int input[] = {3};
        int expectedResult = 3;
        NumberCruncher cut = new NumberCruncher();

        //act
        int actualResult = cut.findHighestNumber(input);

        //arrange
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void find_highest_number_in_array_of_two_where_array_starts_with_largest_number() {
        //arrange
        int input[] = {13,4};
        int expectedResult = 13;
        NumberCruncher cut = new NumberCruncher();

        //act
        int actualResult = cut.findHighestNumber(input);

        //assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void find_highest_number_in_array_of_two_where_array_ends_with_largest_number() {
        //arrange
        int input[] = {7,13};
        int expectedResult = 13;
        NumberCruncher cut = new NumberCruncher();

        //act
        int actualResult = cut.findHighestNumber(input);

        //assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void find_highest_number_in_array() {
        //arrange
        int input[] = {4,5,-8,3,11,-21,6};
        int expectedResult = 11;
        NumberCruncher cut = new NumberCruncher();

        //act
        int actualResult = cut.findHighestNumber(input);

        //assert
        assertEquals(expectedResult,actualResult);
    }

}
