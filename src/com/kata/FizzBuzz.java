package com.kata;

public class FizzBuzz {
    public String play(int number){
        if(number%15 == 0){
            return "FizzBuzz";
        }
        if(number%3 == 0){
            return "Fizz";
        }
        if(number%5 == 0){
            return "Buzz";
        }
        return String.valueOf(number);
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i=1; i <=100; i++){
            System.out.println(fizzBuzz.play(i));
        }
    }

}
