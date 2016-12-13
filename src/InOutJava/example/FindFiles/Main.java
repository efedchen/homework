package InOutJava.example.FindFiles;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

//program should find all the files at the directory with listed extensions

	static class MyFileFilter implements FilenameFilter {
		private String ext;

		public MyFileFilter(String ext) {
			this.ext = ext;
		}

		public boolean accept(File dir, String name) {
			return name.endsWith(ext);
		}
	}

	private static void findFiles(String srcPath, ArrayList <String> ext, ArrayList<String> list) throws IOException {
		File dir = new File(srcPath);
		ArrayList <File[]> files = new ArrayList<>();

		for(String s : ext){
			files.add(dir.listFiles(new MyFileFilter(s)));
		}

		for(File [] f : files){
			for (int i = 0; i < f.length; i++) {
				list.add(srcPath + f[i].getName());
			}
		}

	}

	public static void main(String[] args) {

		ArrayList<String> fileNameList = new ArrayList<>();
		//double brace initializer
		ArrayList<String> extensionsList = new ArrayList() {{add(".txt"); add(".iso");}};

		try {
			findFiles("d:\\", extensionsList, fileNameList);
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String s : fileNameList)
			System.out.println(s);
	}

}