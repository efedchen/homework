package Interfaces.Monitors;

/*add to the "monitor" example, function that will display the
date of creating of the file, and possibility of tracking few files*/

public class Main {
	public static void main(String[] args) {

		Monitors m = new Monitors("c:\\users\\jade\\downloads\\1.txt", new FileEvent());
		Monitors l = new Monitors("c:\\users\\jade\\downloads\\2.txt", new FileEvent());



        m.start();
        l.start();
	}
}