package com.kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTestStage2 {
    private FizzBuzzStage2 fizzBuzzStage2;

    @Before
    public void setup(){
        fizzBuzzStage2 = new FizzBuzzStage2();
    }

    @Test
    public void testFizzDivisibleByThree(){
        int number = 6;
        String numberReturned = fizzBuzzStage2.play(number);
        Assert.assertEquals("Fizz", numberReturned);
    }

    @Test
    public void testFizzContainsThree(){
        int number = 23;
        String numberReturned = fizzBuzzStage2.play(number);
        Assert.assertEquals("Fizz", numberReturned);
    }

    @Test
    public void testBuzzDivisibleByFive(){
        int number = 10;
        String numberReturned = fizzBuzzStage2.play(number);
        Assert.assertEquals("Buzz", numberReturned);
    }

    @Test
    public void testBuzzContainsFive(){
        int number = 52;
        String numberReturned = fizzBuzzStage2.play(number);
        Assert.assertEquals("Buzz", numberReturned);
    }
}
