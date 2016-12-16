package InOutJava.task3;


public class DirInfCollector {
    public static void main(String[] args) {
        String fileToSavePath = "src/InOutJava/task3";
        String fileToSaveName = "DirInfoCollect.txt";
        String toCopyTargetDir = "src/InOutJava/task1";

        InfCollectProcessor icp = new InfCollectProcessor();
        icp.CreateFile(fileToSavePath, fileToSaveName);

        icp.WriteInfoToFile(icp.CollectInfoContent(toCopyTargetDir));
    }
}
