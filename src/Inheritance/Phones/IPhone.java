package Inheritance.Phones;

public class IPhone extends Phone {
//	protected int ownNumb;

	public IPhone(String ownNumb) {
        ContactList.addNumb(ownNumb);
//        System.out.println("IPhone constructor");
		touch = true;
		hasWifi = true;
		screenSize = 3;
	}


    @Override
	final public void call(String number) {
        super.call(number);
        if (ContactList.checkAvail(number)==true){
            System.out.println("IPhone called, and phone with number: "
                    + number + " answered. Success!");
		} else {
			System.out.println("That phone number is unavailable");
        }
    }
	
	@Override
	public void sendSMS(String number, String message) {
        smsQuantity++;
		System.out.println("IPhone class is sending sms " + message + " to " + number
                + ". Iphone send sms" +  smsQuantity + "times.");
	}
}
