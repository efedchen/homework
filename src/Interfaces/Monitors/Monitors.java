package Interfaces.Monitors;

import java.io.File;

public class Monitors {

	IFileEvent event;
	String filef;

	public Monitors(String file , IFileEvent event) {
        this.filef = file;
		this.event = event;
	}

	public void start() {
        while (true){
            File f = new File(filef);

            if (f.exists() && f.isFile()) {
                if (event != null)
                    event.onFileAdded(filef);
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println("Waiting...");
        }
    }
}
