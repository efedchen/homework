package InOutJava.task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class InfCollectProcessor {

    private String path;
    private String name;
    private File fileToSaveInfo;
    private SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd HH:mm");

    public void CreateFile(String pathFile, String fileName) {
        fileToSaveInfo = new File(pathFile, fileName);
    }

    public ArrayList<File[]> CollectInfoContent(String pathTargetDir) {
        ArrayList<File[]> list = new ArrayList<>();
        File filePath = new File(pathTargetDir);

        list.add(filePath.listFiles());
        if (list.get(0).length == 0) {
            System.out.println("Source is empty!");
        } else {
            for (File[] f : list) {
                for (int i = 0; i < f.length; i++) {
                    name = f[i].getName();
                    path = f[i].getAbsolutePath();

                    System.out.printf("Name of the file: %s," +
                            "\nFilePath: %s\n", name, path);
                    System.out.println(sdf.format(f[i].lastModified()));
                }
            }
        }return list;
    }
    public void WriteInfoToFile(ArrayList<File []> arr){
        try (FileWriter writer = new FileWriter(fileToSaveInfo))
 {
                for (File [] f : arr){
                    for (int i = 0; i < f.length; i++) {
                        writer.append(f[i].getName());
                        writer.append(" (");
                        writer.append(f[i].getCanonicalPath());
                        writer.append(") ");
                        writer.append(sdf.format(f[i].lastModified())+ " | ");
                        writer.append(" ");
                        writer.append("\n");
                        writer.flush();
                    }
                }
                writer.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}