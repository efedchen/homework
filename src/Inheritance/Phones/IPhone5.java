package Inheritance.Phones;

public class IPhone5 extends IPhone {

	public IPhone5(String ownNumb){
        super( );
		System.out.println("IPhone5 constructor");
		screenSize = 4;
	}
	
	/*@Override
	public void call(String number) {
		System.out.println("IPhone class is calling " + number);
	}*/ // error because that method is final
	
	@Override
	public void sendSMS(String number, String message) {
		super.sendSMS(number, message);
		System.out.println("IPhone5 class is sending sms " + message + " to " + number);	
	}
}
