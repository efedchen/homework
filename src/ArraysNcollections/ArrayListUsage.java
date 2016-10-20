package ArraysNcollections;


import java.util.ArrayList;
import java.util.Random;

public class ArrayListUsage {

    public static void main(String[] args) {
        //in the collections couldnt be stored primitive types  of data
        ArrayList myLotteryNumbers = new ArrayList();
        myLotteryNumbers.add(new Integer(65));
        myLotteryNumbers.add(new Integer(32));
        myLotteryNumbers.add(new Integer(34));
        //but after java v5 all primitive data types could be wrapped automatically in that case
        //that called !AUTOBOXING!
        int x = 132;
        myLotteryNumbers.add(x);

        //and this is called unboxing
        int luckyNumber = (int) myLotteryNumbers.get(0);
        System.out.println(luckyNumber);

        Random rnd = new Random();
        int randomNumb = rnd.nextInt();
        System.out.println(randomNumb);
        if(randomNumb == luckyNumber) {
            System.out.println("U r unbelievably lucky!");
        } else {
            System.out.println("sorry, u lost");
        }
    }
}
