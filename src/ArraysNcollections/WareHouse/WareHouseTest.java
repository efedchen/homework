package ArraysNcollections.WareHouse;

//class that stores inside array of  any type data
//create method that returns any elem by index

import java.util.LinkedList;

public class WareHouseTest {
    public static void main(String[] args) {
        byte [][] byteArr= {{-100,127},{103,24},{-126,100}};
        WareHouse<byte[]> b = new WareHouse<>();
        b.setData(byteArr);

        for (int i = 0; i < b.getSize(); i++) {
            for (int j = 0; j < b.get(i).length; j++) {
                System.out.print("elem: "+ b.get(i)[j] + ", ");
            }
            System.out.println();
        }
        System.out.println("_____________");

        int [][] intArr = {{1222,213},{1,-10},{0,111},{22222,99992}};
        WareHouse<int[]> intA = new WareHouse<>();
        intA.setData(intArr);

        for (int i = 0; i < intA.getSize(); i++) {
            for (int j = 0; j < intA.get(i).length; j++) {
                System.out.print("elem: "+ intA.get(i)[j] + ", ");
            }
            System.out.println();
        }
    }

}
