package com.kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setup(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testFizz(){
        int number = 3;
        String numberReturned = fizzBuzz.play(number);
        Assert.assertEquals("Fizz", numberReturned);
    }

    @Test
    public void testFizzDivisibleByThree(){
        int number = 6;
        String numberReturned = fizzBuzz.play(number);
        Assert.assertEquals("Fizz", numberReturned);
    }
}
