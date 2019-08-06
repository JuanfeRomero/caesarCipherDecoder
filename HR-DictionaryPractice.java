package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //English to Spanish dictionary
        Map<String, String> englSpanDictionary = new HashMap<String, String>();
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miercoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sabado");
        englSpanDictionary.put("Sunday", "Domingo");
        //assigning days of the week in both english and spanish.
        //Print all those translations to spanish

        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        System.out.println(englSpanDictionary.get("Saturday"));
        System.out.println(englSpanDictionary.get("Sunday"));
        //Print All keys.
        System.out.println(englSpanDictionary.keySet());
        //Print all values.
        System.out.println(englSpanDictionary.values());
        //Print out size
        System.out.println("size "+englSpanDictionary.size());


        //space
        System.out.println();
        System.out.println();

        //Shopping List.
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        //putting stuff in the list
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", true);
        shoppingList.put("Eggs", false);
        shoppingList.put("Sugar", false);
        //retrieving items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Oreos"));
        //Key value pair print out
        System.out.println(shoppingList.toString());
        //Taking things out
        shoppingList.remove("Eggs");
        System.out.println(shoppingList.toString());
        //Replace values for a certaing key
        shoppingList.replace("Bread", Boolean.FALSE);
        System.out.println(shoppingList.toString());
        //Clear out dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.isEmpty());


    }

}
