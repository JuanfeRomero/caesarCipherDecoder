package com.company;

public class Main {

    public static void main(String[] args) {
//The while statement helps you make a loop that you don't know for sure how many times it will loop, you set a loop to repeat itself after meeting some requirement

        int count = 1; //you set an initial value outside of the loop
        while (count != 6) { //you call a while loop to verify that the condition regarding the initial value is met
            System.out.println("Count Value is: " + count);
            count++; //you modify the condition inside the loop and it will repeat as many times as necessary until the condition becomes false
        }

        for (count = 1; count != 6; count++) {//in a for loop you already have an initial value and an increment condition in the loop itself, while in the while loop you have to adjust those things manually
            System.out.println("Count value is: " + count);
        }

        //there are different ways to get the same result with a while loop, for example:
        count = 1;
        while (true) {//in the first while loop we check that the condition keeps false until condition is met
            if (count == 6) {//on the other hand on this while loop we are keeping the loop going while a condition keeps being true
                break;//once the condition is met the break will take us out of the loop
            }
            System.out.println("Count Value is: " + count);
            count++;//but meanwhile the loop will keep adding towards that condition.
        }

        //the condition is the most crucial part of the while loop, if a condition is not realized as intended the loop will most probably not execute and will be skipped entirely
        //for example:
        count = 6;
        while (count != 6) {//the loop is never executed because the condition is already false
            System.out.println("Count Value is " + count);
            count++;
        }

        count = 1;
        //there's a third type of looping statement called the do while loop:
        //its main characteristic is that it always loops at least once as the condition isn't checked until the first loop occurred.
        do {//it executes the loop once
            System.out.println("count value was" + count);
            count++;

            //if(count > 100) {
            //    break;
            //} this add on would iterate the do loop until 100 and then exist the loop via the break statement
        } while (count != 6);//it checks the condition and determines if the loop should iterate again, if the condition where over six in this case it would loop infinitely as the statement goes over 6 and it will always be true;

        /*Create a method called isEvenNumber that takes a parameter of type int
        Its purpose is to determine if the argument passed to the method is
        an even number or not
        return true if an even number, otherwise return false;
         */

        System.out.println(isEvenNumber(4));
        System.out.println(isEvenNumber(5));

        int number = 4;
        int finishNumber = 20;

        int evenCounter = 0; //modification for exercise
        while(number <= finishNumber){//the code starts
            number++;//immediately increases to 5
            if(!isEvenNumber(number)){//if it's not an even number it will go to continue
                continue;//it has the effect of interrupting the code like a break, but it is different in a sense that continue ignores the rest of the loop for that iteration and starts over instead of exiting the loop altogether
            }
            //it will incrementing on every loop and only passing the even ones
            System.out.println("Even number " + number);//finally the even numbers that passed will be printed.
            evenCounter++; //exercise modification
            if(evenCounter == 5){//exercise modification
                System.out.println("Even counter: " + evenCounter + ", Goodbye");//exercise modification
                break; //exercise modification
            } //exercise modification

    }
        //Modify the while code above
        //Make it also record the total number of even numbers it has found
        //and break once 5 are found
        //and at the end, display the total number of even numbers found
    }
    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }else
            return false;
    }


}
