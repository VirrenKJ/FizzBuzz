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

    @Test
    public void testBuzz(){
        int number = 5;
        String numberReturned = fizzBuzz.play(number);
        Assert.assertEquals("Buzz", numberReturned);
    }

    @Test
    public void testBuzzDivisibleByFive(){
        int number = 10;
        String numberReturned = fizzBuzz.play(number);
        Assert.assertEquals("Buzz", numberReturned);
    }

    @Test
    public void testFizzBuzzDivisibleByThreeAndFive(){
        int number = 15;
        String numberReturned = fizzBuzz.play(number);
        Assert.assertEquals("FizzBuzz", numberReturned);
    }
    @Test
    public void testFizzBuzzContainsThreeAndFive(){
        int number = 53;
        String numberReturned = fizzBuzz.play(number);
        Assert.assertEquals("FizzBuzz", numberReturned);
    }
}
