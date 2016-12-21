package Multithreading.task1;

//every 10 sec shows current time
//thread could be interrupted from prompt

public class ShowTimeTest {
    public static void main(String[] args) {
        try {
            System.out.println("Displaying of time every 10 sec is enabled. " +'\n'+
                    "To disable this function type word \"Stop\" into console!");
            ShowTime showtime = new ShowTime();
            showtime.start();
            while (!showtime.isInterrupted()) {
                    showtime.interruptProc();
                }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("FINISHED!");
    }
}
