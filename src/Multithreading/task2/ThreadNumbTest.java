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
        for(ThreadNumb t : l){
            t.interrupt();
        }
        Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
