package Multithreading.task3;

import java.util.ArrayList;

public class ThreadNumb1 extends Thread {

    ArrayList<ThreadNumb2> array = new ArrayList<>();

    public void run() {
        try {
            System.out.println("first thread id: " + getId());
            createChildThread();
            Thread.sleep(5000);
            System.out.println("thread numb1 woke up");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (isInterrupted()) {
            killChildThread();
        }
    }

    public void createChildThread() {
        for (int i = 0; i < 50; i++) {
            ThreadNumb2 t2 = new ThreadNumb2();
            t2.start();
            array.add(t2);
        }
    }
    public void killChildThread(){
        for (Thread t : array) {
            t.interrupt();
            System.out.println("Is thread #" + t.getId() + " interrupted? " + t.isInterrupted());
        }
    }
}
