package Multithreading.task7;

public class CalcThread extends Thread {
    long res;
    int[] arr;

    public CalcThread(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        synchronized (this) {
            for (int i : arr) {
                res += i;
            }
            res /= arr.length;
            notify(); // сообщаем об окончании работы
        }
    }

    public long getResult() {
        return res;
    }
}
