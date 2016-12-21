package Multithreading.task2;

//class that creates 100 threads, each of
//them should print his number and then wait for interrupting

import java.util.ArrayList;

public class ThreadNumbTest {
    public static void main(String[] args) {
        ArrayList<ThreadNumb> l = new ArrayList();
        try {
        for (int i = 0; i < 100 ; i++) {
            ThreadNumb t = new ThreadNumb();
            t.start();
            l.add(t);
        }
            Thread.sleep(1500);
        for(ThreadNumb t : l){
            t.interrupt();
            System.out.println("is thread " + t.getId() + " interrupted? " + t.isInterrupted());
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
