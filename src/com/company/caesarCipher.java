package com.company;

import java.util.HashMap;
import java.util.Map;

public class caesarCipher {


    private static int getLetterValue (char letter){
        HashMap<Character, Integer> alphabetValues = new HashMap<>();
        alphabetValues.put('a', 0);
        alphabetValues.put('b', 1);
        alphabetValues.put('c', 2);
        alphabetValues.put('d', 3);
        alphabetValues.put('e', 4);
        alphabetValues.put('f', 5);
        alphabetValues.put('g', 6);
        alphabetValues.put('h', 7);
        alphabetValues.put('i', 8);
        alphabetValues.put('j', 9);
        alphabetValues.put('k', 10);
        alphabetValues.put('l', 11);
        alphabetValues.put('m', 12);
        alphabetValues.put('n', 13);
        alphabetValues.put('o', 14);
        alphabetValues.put('p', 15);
        alphabetValues.put('q', 16);
        alphabetValues.put('r', 17);
        alphabetValues.put('s', 18);
        alphabetValues.put('t', 19);
        alphabetValues.put('u', 20);
        alphabetValues.put('v', 21);
        alphabetValues.put('w', 22);
        alphabetValues.put('x', 23);
        alphabetValues.put('y', 24);
        alphabetValues.put('z', 25);
        return alphabetValues.get(letter);
    }
    private static char getAlphabetLetter(int value){
        HashMap<Integer, Character> alphabetValues = new HashMap<>();
        alphabetValues.put(0, 'a');
        alphabetValues.put(1, 'b');
        alphabetValues.put(2, 'c');
        alphabetValues.put(3, 'd');
        alphabetValues.put(4, 'e');
        alphabetValues.put(5,'f');
        alphabetValues.put(6,'g');
        alphabetValues.put(7,'h');
        alphabetValues.put(8,'i');
        alphabetValues.put(9,'j');
        alphabetValues.put(10,'k');
        alphabetValues.put(11,'l');
        alphabetValues.put(12,'m');
        alphabetValues.put(13,'n');
        alphabetValues.put(14,'o');
        alphabetValues.put(15,'p');
        alphabetValues.put(16,'q');
        alphabetValues.put(17,'r');
        alphabetValues.put(18,'s');
        alphabetValues.put(19,'t');
        alphabetValues.put(20,'u');
        alphabetValues.put(21,'v');
        alphabetValues.put(22,'w');
        alphabetValues.put(23,'x');
        alphabetValues.put(24,'y');
        alphabetValues.put(25,'z');
        return alphabetValues.get(value);
    }

    public static HashMap<Character, Character> caesarCipher(char firstLetter, char secondLetter){
        HashMap<Character, Character> caesarCipher = new HashMap<>();
        firstLetter = Character.toLowerCase(firstLetter);
        secondLetter = Character.toLowerCase(secondLetter);
        for(int i = 0; i < 26; i++) {
            caesarCipher.put(getAlphabetLetter(i), getAlphabetLetter(getDifferenceInLetterValue(i, getLetterValue(firstLetter), getLetterValue(secondLetter))));
        }
        HashMap<Character, Character> invertedCaesarCipher = new HashMap<>();
        if(getLetterValue(firstLetter) > getLetterValue(secondLetter)){
            for(Map.Entry<Character, Character> entry : caesarCipher.entrySet()){
                invertedCaesarCipher.put(entry.getValue(), entry.getKey());
            }
            return invertedCaesarCipher;
        }
        return caesarCipher;
    }

    private static int getDifferenceInLetterValue(int indexLetter, int firsLetter, int secondLetter) {
        if (firsLetter > secondLetter) {
            if (indexLetter + (firsLetter - secondLetter) > 25) {
                return (indexLetter + (firsLetter - secondLetter) - 26);
            } else
                return (indexLetter + (firsLetter - secondLetter));
        } else if (secondLetter > firsLetter){
            if (indexLetter + (secondLetter - firsLetter) > 25) {
                return (indexLetter + (secondLetter - firsLetter) - 26);
            } else
                return (indexLetter + (secondLetter - firsLetter));
        } else
            return indexLetter;
    }

    public static void decodeWithCaesarCipher(String word, char firstLetter, char secondLetter){
        HashMap<Character, Character> currentCipher = caesarCipher(firstLetter, secondLetter);
        word = word.toLowerCase();
        String decodedMessage = "";
        for(int i = 0; i < word.length(); i++){
            if(currentCipher.get(word.charAt(i)) == null){
                decodedMessage += word.charAt(i);
            }else
                decodedMessage += currentCipher.get(word.charAt(i));
        }
        decodedMessage = decodedMessage.toUpperCase();
        System.out.println("the secret message was: " + decodedMessage);
    }
}
