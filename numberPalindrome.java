package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        //FROM EXCERCISE 15, NUMBER PALINDROME
    }
        public static boolean isPalindrome (int number){
            int reverse = 0;
            int unit = number;
            while(unit != 0){
                int lastDigit = unit%10;
                reverse *= 10;
                reverse += lastDigit;
                unit /= 10;
            }
            reverse += unit;
            if(number == reverse){
                return true;
            }else{
                return false;
            }
        }

    public static boolean hasSharedDigit(int number, int number2){

        //FROM EXERCISE17 HAS SHARED DIGIT
        if(number > 99 || number < 10 || number2 > 99 || number2 < 10){
            return false;
        }else{
            int firstDigit1, secondDigit1, firstDigit2, secondDigit2;
            firstDigit1 = number%10;
            secondDigit1 = number/10;
            firstDigit2 = number2%10;
            secondDigit2 = number2/10;
            if((firstDigit1 == firstDigit2 || firstDigit1 == secondDigit2) || (secondDigit1 == firstDigit2 || secondDigit1 == secondDigit2)){
                return true;
            }
        }
        return false;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(num1<10 || num2<10 || num3<10 || num1>1000 || num2>1000 || num3>1000){
            return false;
        }
        if((num1%10)==(num2%10) || (num1%10)==(num3%10) || (num2%10) == (num3%10)){
            return true;
        }
        return false;
    }

        public static int getGreatestCommonDivisor(int first, int second){
            if(first < 10 || second < 10){
                return -1;
            }

            int smaller, bigger;
            if(first > second){
                smaller = second;
                bigger = first;
            }else{
                smaller = first;
                bigger = second;
            }
            for(int i=smaller; i > 0; i--){
                if((smaller%i) != 0){
                    continue;
                }else if((bigger%i) != 0){
                    continue;
                }else
                    return i;
            }
            return -1;
        }

    public static boolean isPerfectNumber(int number){
        int divisummed=0;
        if(number < 1){
            return false;
        }

        for(int i = 1; i < number; i++){
            if(number%i == 0){
                divisummed += i;
            }
        }
        if(number == divisummed){
            return true;
        }
        return false;
    }
    }

