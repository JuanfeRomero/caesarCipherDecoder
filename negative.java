package com.company;

public class Main {

    public static void main(String[] args) {
/*
Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.

Check that number is > 0, if it is not return false.

If number is odd return true, otherwise return false.

Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.

The method should use a for loop to sum all odd numbers in that range including the end and return the sum.

It should call the method isOdd to check if each number is odd.

The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.

If those conditions are not satisfied return -1 from the method to indicate invalid input.

TIP:use the remainder operator to check if the number is odd

NOTE: Both methods needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a main method to solution code.

 */

        System.out.println(isOdd(1)+" es impar");
        System.out.println(isOdd(2)+" es par");
        System.out.println(isOdd(3)+" es impar");

        System.out.println(sumOdd(1, 11));
    }

    public static boolean isOdd(int number){
        if(number <= 0){
            return false;
        }
        if((number%2)> 0){
            return true;
        }else
                return false;
    }

    public static int sumOdd(int start, int end){

        if ((start < 1) || (end < 1) || (start > end)) {
            return -1;
        }else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {


                    sum += i;
                }
            }
            return sum;
        }
    }
}
