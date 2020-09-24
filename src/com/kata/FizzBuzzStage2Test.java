package com.kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzStage2Test {

    private FizzBuzzStage2 fizzBuzzStage2;

    @Before
    public void setup(){
        fizzBuzzStage2 = new FizzBuzzStage2();
    }

    @Test
    public void testFizz(){
        int number = 3;
        String numberReturned = fizzBuzzStage2.play(number);
        Assert.assertEquals("Fizz", numberReturned);
    }
    @Test
    public void testFizzDivisibleByThree(){
        int number = 6;
        String numberReturned = fizzBuzzStage2.play(number);
        Assert.assertEquals("Fizz", numberReturned);
    }
    @Test
    public void testBuzz(){
        int number = 5;
        String numberReturned = fizzBuzzStage2.play(number);
        Assert.assertEquals("Buzz", numberReturned);
    }
    @Test
    public void testBuzzDivisibleByFive(){
        int number = 10;
        String numberReturned = fizzBuzzStage2.play(number);
        Assert.assertEquals("Buzz", numberReturned);
    }
    @Test
    public void testFizzBuzzDivisibleByThreeAndFive(){
        int number = 15;
        String numberReturned = fizzBuzzStage2.play(number);
        Assert.assertEquals("FizzBuzz", numberReturned);
    }
    @Test
    public void testFizzBuzzContainsThreeAndFive(){
        int number = 53;
        String numberReturned = fizzBuzzStage2.play(number);
        Assert.assertEquals("FizzBuzz", numberReturned);
    }
    @Test
    public void testFizzBuzzDivisibleByThreeAndContainsFive(){
        int number = 51;
        String numberReturned = fizzBuzzStage2.play(number);
        Assert.assertEquals("FizzBuzz", numberReturned);
    }
    @Test
    public void testFizzBuzzDivisibleByFiveAndContainsThree(){
        int number = 35;
        String numberReturned = fizzBuzzStage2.play(number);
        Assert.assertEquals("FizzBuzz", numberReturned);
    }
    @Test
    public void testFizzContainsThree(){
        int number = 13;
        String numberReturned = fizzBuzzStage2.play(number);
        Assert.assertEquals("Fizz", numberReturned);
    }
    @Test
    public void testBuzzContainsFive(){
        int number = 52;
        String numberReturned = fizzBuzzStage2.play(number);
        Assert.assertEquals("Buzz", numberReturned);
    }
}
