package com.kata;

public class FizzBuzzStage2 {

    public String play(int number){
        if(String.valueOf(number).contains("3") && String.valueOf(number).contains("5")){
            return "FizzBuzz";
        }
        if(number%3 == 0 && String.valueOf(number).contains("5")){
            return "FizzBuzz";
        }
        if(number%15 == 0){
            return "FizzBuzz";
        }
        if(number%3 == 0 || String.valueOf(number).contains("3")){
            return "Fizz";
        }
        if(number%5 == 0){
            return "Buzz";
        }
        return String.valueOf(number);
    }

    public static void main(String[] args) {
        FizzBuzzStage2 fizzBuzzStage2 = new FizzBuzzStage2();
        for (int i=1; i <=100; i++){
            System.out.println(fizzBuzzStage2.play(i));
        }
    }
}
