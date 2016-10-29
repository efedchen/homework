package Inheritance.Phones;


public abstract class Phone {
	
	protected boolean touch;
	protected boolean hasWifi;
	protected int screenSize;
    protected int smsQuantity;  //int automatically initialized by 0
    protected int callQuantity;  //int automatically initialized by 0

	public Phone() {System.out.println("Phone constructor");}
	
	public boolean isTouch() {
		return touch;
	}
	
	public boolean isHasWifi() {
		return hasWifi;
	}
	
	public int getScreenSize() {
		return screenSize;
	}
	
	public void call(String number) {
		callQuantity++;
		System.out.println("Phone class is calling " + number
                + ". Phone called = " + callQuantity + " times.");
	}

    //abstract method cannot have a body
	public abstract void sendSMS(String number, String message);
}
