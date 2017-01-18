package ArraysNcollections.Monitor2.test;

public interface IFileEvents {
    void onFileAdded(String path);
    void onFileDeleted(String path);
    void onFileModified(String path, long time);
}
