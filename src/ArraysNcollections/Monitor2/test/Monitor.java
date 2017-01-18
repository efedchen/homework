package ArraysNcollections.Monitor2.test;

import java.lang.InterruptedException;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;

public class Monitor {
	
	private String path;
	private int timeout;
	private ArrayList<String> prev = new ArrayList<>();
	private ArrayList<Long> prevTime = new ArrayList<>();
	private ArrayList<String> tempPath = new ArrayList<>();
	private ArrayList<String> curr = new ArrayList<>();
	private ArrayList<Long> currTime = new ArrayList<>();
	private IFileEvents events;

	public Monitor(String path) {
		this.path = path;
		createArray(prev);
		saveModTime(prevTime,tempPath);
	}

	public void start() {
		while (true) {
			createArray(curr);
			saveModTime(currTime,tempPath);

			compareArrays(prev, curr);
			compareTime(prevTime,currTime,tempPath);

			prevTime.clear();
			prevTime.addAll(currTime);
			prev.clear();
			prev.addAll(curr);
			
			System.out.println("Waiting...");
			try {
				Thread.sleep(timeout);
			} catch (InterruptedException ex) {
				return;
			}
		}
	}

//	public int getTimeout() {
//		return timeout;
//	}

	public void setTimeout(int value) {
		timeout = value;
	}

	public IFileEvents getEvents() {
		return events;
	}

	public void setEvents(IFileEvents value) {
		events = value;
	}

	private void doFileAdded(String path) {
		if (events != null)
			events.onFileAdded(path);
	}

	private void doFileDeleted(String path) {
		if (events != null)
			events.onFileDeleted(path);
	}

	private void doFileModified(String path, long time){
		if (events != null)
			events.onFileModified(path, time);
	}

	private void compareArrays(ArrayList<String> m1, ArrayList<String> m2) {
		Iterator<String> it = m1.iterator();
		String path;
		
		while (it.hasNext()) {
			path = it.next();

			if ( ! m2.contains(path))
				doFileDeleted(path);
		}

		it = m2.iterator();
		while (it.hasNext()) {
			path = it.next();

			if ( ! m1.contains(path))
				doFileAdded(path);
		}
	}

	private void createArray(ArrayList<String> output) {
		try {
			File file = new File(path);
			File[] list = file.listFiles();

			output.clear();
			for (File f : list) {
				output.add(f.getCanonicalPath());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	private void saveModTime(ArrayList<Long> outputTime, ArrayList<String> outputPath){
		File file = new File(path);
		File[] list = file.listFiles();

		long listTime [] = new long[list.length];
		for (int i = 0; i <list.length; i++) {
			 listTime[i]= list[i].lastModified();
		}

		outputTime.clear();

		for (long l : listTime){
			outputTime.add(l);
		}
		try {
			for (File f : list){
					outputPath.add(f.getCanonicalPath());
			}
		} catch (IOException e) {
				e.printStackTrace();
		}
	}
	private void compareTime(ArrayList<Long> m1, ArrayList<Long> m2, ArrayList<String> outputPath){
		Iterator<Long> it = m1.iterator();
		Iterator<String> strIt = outputPath.iterator();
		Iterator<String> strIt2 = outputPath.iterator();
		long time;
		String path;

		while (it.hasNext()) {
			time = it.next();
			path = strIt.next();

			if ( ! m2.contains(time))
				doFileModified(path,time);
		}

		it = m2.iterator();
		while (it.hasNext()) {
			time = it.next();
			path = strIt2.next();

			if ( ! m1.contains(time))
				doFileModified(path,time);
		}
	}
}
