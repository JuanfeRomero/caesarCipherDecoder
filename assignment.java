package com.company;

public class Main {

    public static void main(String[] args) {
        // the body of the while loop keeps iterating while the condition is found true
        // while(condition){
        //}<-this body is the thing iterating after checking the condition
        //unlike the for loop that has the initialization, condition and increment inside the statement you need to declare that variable outside the loop to utilize it in the while loop
        //do while loop syntax
        //do{
        // statements
        //}while (condition); <- semicolon is required
        //in the do while the statements are executed at least once because the condition is at the bottom of the loop
        int count = 1;//init
        while (count <=5){//condition
            System.out.println("count= " + count);
            count++;//increment
    }

        for(int i = 0/*init*/; i <= 5 /*condition*/; i++/*increment*/) {
            System.out.println("i= " + i);
        }
        //both end up with the say result
        //continue and break:
        int number = 0;//init
        while(number < 15) /*check condition 0 < 15 is true*/{
            number++;//number = 1

            if ( number <= 5)/*check condition 1 <= 5 is true*/{
                //execute code block
                System.out.println("Skipping number " + number);
                continue;//CONTINUES with another iteration of the same loop (by pass all other code left in the block/body)
            }

            System.out.println("number= " + number);//execute code when value reaches 5 because the if above is false and the continue is avoided

            if ( number >= 10)/*check condition 6 >= 10 is true*/{
                System.out.println("Breaking at " + number);//executes the code
                break;//break statement to get out of the loop entirely
            }

            }
        //the WHILE loop checks the condition at the start before executing the block.
        //with the DO WHILE loop the code block is executed at least once and the the condition is checked
        //be careful with conditions, it is EASY to end up with an endless loop in other worlds a loop that never ends or to end up with a loop that never executes
        //TIP: ALWAYS CHECK YOUR CONDITIONS AND EXPRESSIONS
        //we can interrupt the loop by using a CONTINUE and/or a BREAK statement
        //with the CONTINUE keyword the loop will bypass the part of the code that is below the CONTINUE keyword and continue with the next iteration
        //with the BREAK keyword we can exit the loop depending on the condition that we are checking.
    }
}
