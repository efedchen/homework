package InOutJava.example.someStuff;

import java.io.*;
import java.net.URL;

public class ExampleIO {
    public static void main(String[] args) throws IOException {

        File file = new File ("hello.txt"); //creates the file hello.txt at the catalogue

        System.out.println("Did we got the file? " + file);
        System.out.println("Does it exists? " + file.exists());
        System.out.println("Is that file is a directory? " + file.isDirectory());

        BufferedReader firstLineReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String firstLine = firstLineReader.readLine();
            firstLineReader.close();
            System.out.println("Read a line: " + firstLine);
        System.out.println("______________");

        URL url = new URL("http://www.gutenberg.org/cache/epub/2265/pg2265.txt");
            InputStream stream = url.openStream();
        BufferedReader shakspearReader = new BufferedReader(new InputStreamReader(stream));
            String shakespearsPoem = shakspearReader.readLine();

        OutputStream outStream = new FileOutputStream(file);

        //buffered reader returns null when u get into the end of the file
        while (shakespearsPoem !=null){
            outStream.write(shakespearsPoem.getBytes());
            shakespearsPoem = shakspearReader.readLine();
        }
        outStream.close();

        //modifier "r" says that file is opened only for reading
        RandomAccessFile rAfile = new RandomAccessFile(file, "r");

        rAfile.seek(15478);
        int b = rAfile.read();
        while (b != -1){
            shakespearsPoem = shakespearsPoem + (char) b;
            b = rAfile.read();
        }
        char arrayC []= shakespearsPoem.toCharArray();

        for (int i = 5; i < arrayC.length; i++) {
            if (i%75 !=0) {
                System.out.print(arrayC[i]);
            }
            else {
                System.out.print(arrayC[i]);
                System.out.println();
            }
        }
        shakspearReader.close();
        rAfile.close();
    }
}
