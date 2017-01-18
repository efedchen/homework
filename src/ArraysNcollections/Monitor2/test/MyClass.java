package ArraysNcollections.Monitor2.test;

import java.text.SimpleDateFormat;

//monitor that shows added/deleted/modified files in directory

public class MyClass {

    private static class MyEvents implements IFileEvents {
        public void onFileAdded(String path) {
            System.out.println("File added: " + path);
        }
        public void onFileModified(String path, long time) {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            System.out.println("File: "+ path + " modified at: " + sdf.format(time));
        }
        public void onFileDeleted(String path) {
            System.out.println("File deleted: " + path);
        }
    }

    public static void main(String[] args) {
        Monitor m = new Monitor("c:\\Intel");
        m.setTimeout(2000);
        m.setEvents(new MyEvents());
        m.start();
    }
}