package Inheritance.Phones;

public class MainClass {

	public static void main(String[] args) {
		// Inheritance.Phones p = new Inheritance.Phones(); error because that class is abstract - basic class
		
		Nokia3310 nokia = new Nokia3310("843-12-12");
		IPhone iphone1 = new IPhone("547-35-61");
        SamsungS4 samsungS4 = new SamsungS4("123-45-67");
        
		System.out.println("Nokia3310 screen size: " + nokia.getScreenSize());
		nokia.call("123-45-67");
		nokia.call("547-35-61");
		nokia.call("999-45-99");
		nokia.sendSMS("567-78-89", "text message");
		nokia.sendSMS("567-78-89", "text WADAAAAAAAAAAAAAAP!");

		System.out.println("----------------------------------");
		

		System.out.println("IPhone screen size: " + iphone1.getScreenSize());
		iphone1.call("123-45-67");
		iphone1.call("111-00-00");
		iphone1.call("123-43-43");
		iphone1.sendSMS("567-78-89", "text message");
		iphone1.sendSMS("567-78-89", "HOW R U");

		System.out.println("----------------------------------");
		
		IPhone5 iphone5 = new IPhone5("999-45-99");
		System.out.println("IPhone screen size: " + iphone5.getScreenSize());
		iphone5.call("123-45-67");
		iphone5.call("123-45-67");
		iphone5.sendSMS("567-78-89", "text message");
		iphone5.sendSMS("567-78-89", "text message");
	}
}
