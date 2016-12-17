package InOutJava.task4;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class CopyInOne {
    public void CopyInOne(File firstSourcePath, File secondSourcePath,
                          File thirdSourcePath, File destPath) {
        try {
            FileInputStream strR1 = new FileInputStream (firstSourcePath);
            FileInputStream strR2 = new FileInputStream (secondSourcePath);
            FileInputStream strR3 = new FileInputStream (thirdSourcePath);

            FileOutputStream f = new FileOutputStream(destPath);

            SequenceInputStream sequence = new SequenceInputStream(new SequenceInputStream(strR1,strR2),strR3);

            //That way could be used when there is need in appending high quantity of streams in one
//            Vector<InputStream> inputStreams = new Vector<InputStream>();
//            inputStreams.add(strR1);
//            inputStreams.add(strR2);
//            inputStreams.add(strR3);

//            Enumeration<InputStream> enu = inputStreams.elements();
//            SequenceInputStream sequence = new SequenceInputStream(enu);

            int oneByte;
            //streams outputs data all the time, so oneByte should be assigned inside "while"
            while ((oneByte = sequence.read()) != -1) {
                f.write(oneByte);
                System.out.write(oneByte);
            }
            System.out.flush();
        }catch (Exception e){e.printStackTrace();}
    }
}
