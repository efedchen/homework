package Multithreading.task5;

import java.util.ArrayList;

public class SumMultiThread {
    private int numberOfThreads;
    private int [] array;
    private ArrayList<ArrayWorkerThread> aList = new ArrayList<>();
    private long time;
    private long summary;
    private int point;

    public long getTime() {
        return time;
    }

    public long getSummary() {
        return summary;
    }


    public SumMultiThread(int numberOfThreads, int[] array) {
        this.numberOfThreads = numberOfThreads;
        this.array = array;
    }
    public void calculate(){
        point =  array.length/numberOfThreads;
        long start = System.currentTimeMillis();

        for (int i = 0; i < numberOfThreads; i++) {
            try {
                ArrayWorkerThread thread = new ArrayWorkerThread(array, i*point, (i+1)*point);
                aList.add(thread);
                thread.start();
                thread.join();

                this.summary += thread.getSummary();
                thread.interrupt();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        time = end - start;
    }
}
