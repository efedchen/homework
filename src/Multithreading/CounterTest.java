package Multithreading;

//class that prints out numbers in cycle (multithreading)

public class CounterTest {
    public static class Counter extends Thread {
        private int topLim;
        private int bottomLim;
        private int step;

        public Counter(int bottomLim, int topLim, int step) {
            this.topLim = topLim;
            this.bottomLim = bottomLim;
            this.step = step;
        }

        public void run() {
            System.out.printf("Printing numbers in range [%d....%d], with step: %d\n",
                    bottomLim, topLim, step);
            increment();
        }

        private void increment(){
            int pointer = bottomLim;
            while(pointer<=topLim) {
                System.out.println(getId() + ":" + pointer);
                pointer+=step;
                try {
                    Thread.sleep(500);
                    //    Thread.yield();
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            Counter c = new Counter(10,26,2);
            c.start();
            //c.join();
            Thread.sleep(5000);
            c.interrupt();
        }catch (Exception e){}
    }
}
