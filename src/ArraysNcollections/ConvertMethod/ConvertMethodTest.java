package ArraysNcollections.ConvertMethod;

/*method that converts array of strings/numbers into list*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertMethodTest {
    public static void main(String[] args) {
        String [] strArr = {"15","hey","howDoYouDo","WHADUP","10"};
        List<String> list;
        list = convArray(strArr);
        for (String s:list){
            System.out.println(s);
        }
        System.out.println("________");

        list = convArrayEx(strArr);
        for (String s : list)
            System.out.println(s);
        System.out.println("________");

        list = Arrays.asList(strArr);
        for (String s : list)
            System.out.println(s);
    }
    static List<String> convArray(String [] temp){
        ArrayList array = new ArrayList();
        for (int i = 0; i < temp.length; i++) {
            array.add(temp[i]);
        }
        return array;
    }
    static <T> List<T> convArrayEx(T[] a){
        List <T> res = new ArrayList<T>(a.length);
        for (T t : a){
            res.add(t);
        }
        return res;
    }
}
