package InOutJava.task1;

//program that reads a txt file and replaces all "hello" occurrences to '1234'

import java.io.*;

public class TextProcessorTest {
    public static void main(String[] args) {

        File file = new File("text.txt");
        try (FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Hello");
        }catch (Exception e){e.printStackTrace();}

        TextProcessor.replace("text.txt","Hello","1234");
        TextProcessor.printFile("text.txt");
    }

}
