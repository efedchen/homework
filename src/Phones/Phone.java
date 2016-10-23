package Phones;


public abstract class Phone {
	
	protected boolean touch;
	protected boolean hasWifi;
	protected int screenSize;
    protected int objQuantity;  //int os initialized by 0
	
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
		System.out.println("Phone class is calling " + number);
	}
	
	public abstract void sendSMS(String number, String message);
}
