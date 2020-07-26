package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the message you want to code/decode");
        String message = s.nextLine();
        System.out.println("Enter the first letter in your cipher");
        char firstLetter = s.next().charAt(0);
        System.out.println("Enter the second letter in your cipher");
        char secondLetter = s.next().charAt(0);
        caesarCipher.decodeWithCaesarCipher(message, firstLetter, secondLetter);
        }
}
