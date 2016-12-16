package InOutJava.task2;

import java.io.File;
import java.io.IOException;

public class FileCopierTest {
    public static void main(String[] args) throws IOException {

        // firstly the Source directory should be created and filled with files
        // !program doesnt checks if there is same files at destination directory!

        File fileSource = new File("src/InOutJava/task2/exampleSource");
        File fileDestination = new File("src/InOutJava/task2/exampleDestination");

        FileCopier fc = new FileCopier(fileSource,fileDestination);
        fc.checkInside();
    }
}
