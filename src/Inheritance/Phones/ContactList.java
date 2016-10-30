package Inheritance.Phones;

import java.util.ArrayList;

public abstract class ContactList {
    private static ArrayList <String> array;

    public static void addNumb(String numb){
        array.add(numb);
    }

    public static boolean checkAvail(String number){
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equalsIgnoreCase(number)){
                return true;}
        }return false;
    }
}
