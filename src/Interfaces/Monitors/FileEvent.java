package Interfaces.Monitors;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEvent implements IFileEvent {
	@Override
	public void onFileAdded(String s) {
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("hh-mm-ss, aa, dd.MM.yyyy");
		System.out.println("File is added: " + s + ", at: " + format.format(d));
	}
}
