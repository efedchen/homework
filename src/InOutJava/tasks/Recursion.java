package InOutJava.tasks;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

//recursion function which shows all files and catalogues, that have title longer
//than 5 symbols and second letter  is "A"

class MyClass {
	static class MyFileFilter implements FilenameFilter {

		public MyFileFilter() {
		}

		public boolean accept(File dir, String name) {
			return name.lastIndexOf("")>=5&&name.charAt(1)=='a';
		}
	}

	private static void listAll(String path, ArrayList<String> res)
		throws IOException
	{
		File dir = new File(path);
		File[] list = dir.listFiles(new MyFileFilter());
		for (File f : list) {
			if (f.isFile()) {
				res.add("File_____: " + f.getAbsolutePath());
			} else {
				res.add("Directory: " + f.getCanonicalPath());
				listAll(f.getCanonicalPath(), res);
			}
		}
	}

	public static void main(String[] args) {
		final String path = "E:\\javaLessons\\lessons\\src\\InOutJava";
		ArrayList<String> res = new ArrayList<String>();

		try {
			listAll(path, res);
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String s : res)
			System.out.println(s);
	}
}