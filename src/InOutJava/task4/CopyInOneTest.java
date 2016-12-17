package InOutJava.task4;

//copies few txt files into one

import java.io.File;

public class CopyInOneTest {
    public static void main(String[] args) {
        CopyInOne copy = new CopyInOne();
        File inputFile1 = new File("1.txt");
        File inputFile2 = new File("2.txt");
        File inputFile3 = new File("3.txt");
        File dest = new File("dest.txt");

        copy.CopyInOne(inputFile1,inputFile2,inputFile3,dest);
    }

}

