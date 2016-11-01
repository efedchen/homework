package Inheritance.Phones;

import java.util.ArrayList;

public abstract class ContactList {
    public static ArrayList <String> array = new ArrayList<>();

    public static void addNumb(String numb){
        array.add(numb);
    }

    public static boolean checkAvail(String number){

//        for (int i = 0; i < array.size(); i++) {
//            if (array.get(i).equalsIgnoreCase(number)){
//                return true;}
//        }return false;

        if (array.contains(number)) {
            return true;
        }return false;
    }
}
