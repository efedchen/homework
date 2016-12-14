package InOutJava.tasks;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

//recursion function which shows all files and catalogues, that have title longer
//than 5 symbols and second letter  is "A"

class MyClass {
/*	private static boolean specFunction (String title){
		if (title.toCharArray().length>8){
			return false;
		}
		return true;
	}
	private static File[] checkTitle(File [] f) {
		for (File file : f) {
			if (specFunction(file.getName())) {
				for (int i = 0; i < f.length; i++) {
					File[] list2 = new File[f.length - 1];
					System.arraycopy(f, 0, list2, 0, i);
					System.arraycopy(f, i + 1, list2, i, f.length - i - 1);
					return list2;
				}
			}
		}return f;
	}
*/	private static void listAll(String path, ArrayList<String> res)
		throws IOException 
	{
		File dir = new File(path);
		File[] list = dir.listFiles();
//		checkTitle(list);
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