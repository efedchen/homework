package Multithreading.task1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ShowTime extends Thread {

    public void run(){
        while(!isInterrupted()){
            try {
                show();
                Thread.sleep(5000);
            }catch (InterruptedException e){return;}
        }
    }
    public void interruptProc(){
        Scanner s = new Scanner(System.in);
        if(s.next().equals("Stop")){
            interrupt();
        }else{
            System.out.println("Entered value cant stop the process!");
        }
    }
    public void show(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Its :" + sdf.format(d));
    }
}
