package interfaces;

public class Main {
	
	public static void main(String[] args) {
		int num = 666;
		
		Phone brunosPhone;
		
		brunosPhone = new Phone(num);
		brunosPhone.powerOn();
		brunosPhone.dial(num);
		brunosPhone.callPhone(num);
		brunosPhone.response();
	}
}
