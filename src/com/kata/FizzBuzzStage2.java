package com.kata;

public class FizzBuzzStage2 {

    /*
    Stage 2 - new requirements are
    -> A number is fizz if it is divisible by 3 or if it has a 3 in it
    -> A number is buzz if it is divisible by 5 or if it has a 5 in it
    --> But as there are no instructions for what to print,
    for a number like 51 which is divisible by 3 and also contains 5 in it
    or a number like 35 which contains 3 and also divisible by 5.
    --> So, this method will print on the basis of first come first have.
    */

    public String play(int number) {
        if(number%3 == 0 || String.valueOf(number).contains("3")){
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
