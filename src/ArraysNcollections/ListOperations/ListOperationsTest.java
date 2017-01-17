package ArraysNcollections.ListOperations;

//method that creates list, adds 10 elements,
//then deletes first two and the last element
//and prints the list

import java.util.ArrayList;
import java.util.List;

public class ListOperationsTest {
    public static void main(String[] args) {
        String [] strArr = {"hi","my", "name", " is", "Say"};
        List<String> list;

        list = operationArrList(strArr);
        for (String s: list){
            System.out.println(s);
        }
    }
    static <T> List <T> operationArrList(T[] a){
        List <T> res = new ArrayList<T>(a.length);
        for (T t : a){
            res.add(t);
        }
            if (res.get(0) != null && res.get(1)!=null) {
                for (int i = 0; i < 2; i++) {
                 res.remove(0);
                }
            } else {
                System.out.println("Fill the list!");
            }
            res.remove(res.size()-1);
        return res;
    }
}
