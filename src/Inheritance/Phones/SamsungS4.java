package Inheritance.Phones;

public class SamsungS4 extends Phone{

    public SamsungS4 (String ownNumb){
        ContactList.addNumb(ownNumb);
//        System.out.println("samsung s4 constructor");
        touch = true;
        hasWifi = true;
        screenSize = 5;
    }
    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Samsung S4 sended sms, from number: "+number+
        ".Hello, the message is: "+ message);
    }
}
