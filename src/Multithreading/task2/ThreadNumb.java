package Multithreading.task2;

public class ThreadNumb extends Thread{
    public void run() {
        System.out.println("The thread numb: "+ getId()+" is started!");
        while(!isInterrupted()){} // Do nothing, just wait to get interrupted
    }
}
