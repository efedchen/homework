package Inheritance.Phones;

public class IPhone extends Phone {
	
	public IPhone() {
		System.out.println("IPhone constructor");
		touch = true;
		hasWifi = true;
		screenSize = 3;
	}
	
    @Override
	final public void call(String number) {
        super.call(number);
        System.out.println("IPHONE!");
    }
	
	@Override
	public void sendSMS(String number, String message) {
        smsQuantity++;
		System.out.println("IPhone class is sending sms " + message + " to " + number
                + ". Iphone send sms " + smsQuantity + " times.");
	}
}
