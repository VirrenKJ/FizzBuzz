package com.kata;


public class FizzBuzz {

    public String play(int number){
        if(number%3 == 0){
            return "Fizz";
        }
        if(number%5 == 0){
            return "Buzz";
        }
        return String.valueOf(number);
    }

    public static void main(String[] args) {
    }
}
