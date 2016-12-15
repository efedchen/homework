package InOutJava.task1;


import java.io.*;

public class TextProcessor {

    public static void replace(String filePath, String replaceWhat,
                               String replaceWith){
        StringBuilder strBuild = new StringBuilder();
        //reads the file
        try (
            FileReader readFilePath = new FileReader(filePath);
            BufferedReader buffReaderFilePath = new BufferedReader(readFilePath))
        {
            readLines(replaceWhat, replaceWith, buffReaderFilePath, strBuild);
        } catch (IOException excp) {
            excp.printStackTrace();
        }
        //writes into the file
        try (
            FileWriter writeIntoFilePath = new FileWriter(filePath);
            BufferedWriter buffWriterIntoFilePath = new BufferedWriter(writeIntoFilePath))
        {
            buffWriterIntoFilePath.write(strBuild.toString());
        } catch (IOException excp) {
            excp.printStackTrace();
        }
    }

    public static void printFile (String filePath){
        try (
            FileReader readFilePath = new FileReader(filePath);
            BufferedReader buffReaderFilePath = new BufferedReader(readFilePath))
        {
            int bytes = 0;
            char [] buffer = new char [1024];

            while(bytes != -1) {
                bytes = buffReaderFilePath.read(buffer, 0, buffer.length);

            if (bytes != -1) {
                System.out.println(new String(buffer, 0, bytes));
            }
            }
        } catch (IOException excp) {
            excp.printStackTrace();
        }
    }

    public static void readLines(String replaceWhat, String replaceWith,
                                 BufferedReader br, StringBuilder strB) throws IOException {
        char [] buffer = new char[1024];

        do {
            int marker = br.read(buffer);
            if (marker == -1) {
                break;
            }
            if(String.valueOf(buffer).contains(replaceWhat)){
                strB.append(String.valueOf(buffer).replace(replaceWhat,replaceWith),0,marker);
                continue;
            }
            strB.append(buffer,0,marker);
        }while (buffer !=null);
    }

}
