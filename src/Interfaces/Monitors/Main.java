package Interfaces.Monitors;

public class Main {
	public static void main(String[] args) {
		Monitors m = new Monitors("c:\\users\\jade\\downloads\\1.txt", new FileEvent());
		m.start();
	}
}