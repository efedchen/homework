package Multithreading.task3;

//creates 50 threads, they wait for interrupting. Interrupting is invoked from main thread
public class ThreadNumb2Test {
    public static void main(String[] args) {
        try {
            ThreadNumb1 t = new ThreadNumb1();
            t.start();
            Thread.sleep(5000);
            System.out.println("Main thread woke up.");
            t.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
