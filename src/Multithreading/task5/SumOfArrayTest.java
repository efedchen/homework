package Multithreading.task5;

import java.util.Random;

public class SumOfArrayTest {
    public static void main(String[] args) {
        int arraySize = 250000000;
        int[] array = new int[arraySize];
        int numberOfThreads = 10;
        Random r = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i]=r.nextInt(Integer.MAX_VALUE);
        }
        SimpleAlgrthm simpleSum = new SimpleAlgrthm(array);
        SumMultiThread threadSum = new SumMultiThread(numberOfThreads,array);

        simpleSum.calculate();
        threadSum.calculate();

        System.out.println("Summary w/o threads: " + simpleSum.getSummary()
                 +  ". Time: " + simpleSum.getTime());
        System.out.println("Summary with threads: " + threadSum.getSummary()
                 +  ". Time: " + threadSum.getTime());
    }
}
