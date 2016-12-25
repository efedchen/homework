package Multithreading.task5;

public class SimpleAlgrthm {
    private int []array;
    private long summary;
    private long time;

    public SimpleAlgrthm(int []array) {
        this.array = array;
    }

    public long getSummary() {
        return summary;
    }

    public long getTime() {
        return time;
    }

    public void calculate(){
        long start = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            summary +=array[i];
        }
        long end = System.currentTimeMillis();
        time = end - start;
    }
}
