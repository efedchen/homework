package Interfaces.HumanCompare;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human []list ={new Human (40), new Human (20), new Human(19), new Human(10)};
        Arrays.sort(list, new HumanComparator());

        for (Human h : list) {
            System.out.println(h.getAge());
        }
    }
}
