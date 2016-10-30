package Inheritance.Phones;

public class Nokia3310 extends Phone {
	
	public Nokia3310(String ownNumb) {
        ContactList.addNumb(ownNumb);
		System.out.println("Nokia3310 constructor");
		touch = false;
		hasWifi = false;
		screenSize = 2;
	}
	
	@Override
	public void call(String number) {
		super.call(number);
		System.out.println("Nokia3310 class is calling " + number);
	}
	
	@Override
	public void sendSMS(String number, String message) {
		smsQuantity++;
		System.out.println("Nokia3310 class is sending sms " + message
                + " to " + number + ". Nokia sended sms " + smsQuantity + " times.");
	}
}
