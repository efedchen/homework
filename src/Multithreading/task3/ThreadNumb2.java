package Multithreading.task3;


public class ThreadNumb2 extends Thread {
    public void run(){
        System.out.println("Child Thread #" + getId() + " is created.");
        while(!isInterrupted()){}
    }
}

