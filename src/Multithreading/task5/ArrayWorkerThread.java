package Multithreading.task5;

public class ArrayWorkerThread extends Thread {
    private int [] array;
    private long summary;
    private int startPoint;
    private int endPoint;

    public ArrayWorkerThread(int[] array, int startPoint, int endPoint) {
        this.array = array;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public long getSummary() {
        return summary;
    }

    public void run(){
        calculate();
    }
    public synchronized void calculate(){
        for (int i = startPoint; i < endPoint; i++) {
            summary += array[i];
        }
    }
}
