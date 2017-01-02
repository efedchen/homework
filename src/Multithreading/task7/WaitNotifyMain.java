package Multithreading.task7;

import java.util.Arrays;
import java.util.Random;

public class WaitNotifyMain {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10000000];
        Arrays.fill(arr, r.nextInt(Integer.MAX_VALUE));

        CalcThread ct = new CalcThread(arr);
        ct.start(); // the counting started in different thread

        synchronized (ct) {
            try {
                ct.wait(); // ждем завершения потока
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            System.out.println("Result is " + ct.getResult()); // результат
        }
    }
}
