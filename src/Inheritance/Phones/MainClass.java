package Inheritance.Phones;

public class MainClass {

	public static void main(String[] args) {
		// Inheritance.Phones p = new Inheritance.Phones(); error because that class is abstract - basic class
		
		Nokia3310 nokia = new Nokia3310();
		Nokia3310 nokia1 = new Nokia3310();
		Nokia3310 nokia2 = new Nokia3310();
		System.out.println("Nokia3310 screen size: " + nokia.getScreenSize());
		nokia.call("123-45-67");
		nokia.sendSMS("567-78-89", "text message");
		
		System.out.println("----------------------------------");
		
		IPhone iphone1 = new IPhone();
		IPhone iphone2 = new IPhone();
		IPhone iphone3 = new IPhone();
		System.out.println("IPhone screen size: " + iphone1.getScreenSize());
		iphone1.call("123-45-67");
		iphone1.sendSMS("567-78-89", "text message");
		
		System.out.println("----------------------------------");
		
		IPhone5 iphone5 = new IPhone5();
		System.out.println("IPhone screen size: " + iphone5.getScreenSize());
		iphone5.call("123-45-67");
		iphone5.sendSMS("567-78-89", "text message");
	}
}
