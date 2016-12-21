package Multithreading.task2;

public class ThreadNumb extends Thread{
    public void run(){
        System.out.println("Thats the thread numb: "+ getId()+" is started!");
//        try {
//            join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        if(isInterrupted()){
//            System.out.println("interrupted");
//        }
    }
}
