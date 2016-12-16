package InOutJava.task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class FileCopier {

    private File pathSource;
    private File pathDestination;

    public FileCopier(File pathSource, File pathDestination) {
        this.pathSource = pathSource;
        this.pathDestination = pathDestination;
    }

    public void moveFile (String pathSource, String pathDestination){
        try {
            File source = new File(pathSource);
            File destination = new File(pathDestination);

            Files.move(source.toPath(),destination.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void checkInside(){
        ArrayList<File[]> listOfFilesInside = new ArrayList();
        listOfFilesInside.add(pathSource.listFiles());

        if(listOfFilesInside.get(0).length==0){
            System.out.println("Source directory is Empty!");
        } else {
            for (File [] f : listOfFilesInside) {
                for (int i = 0; i < f.length; i++) {
                    moveFile(f[i].toString(), pathDestination.toString() + "\\" + f[i].getName());
                }
            }
        }
    }
}
