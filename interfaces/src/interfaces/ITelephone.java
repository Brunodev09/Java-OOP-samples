package interfaces;

public interface ITelephone {
	//classes signatures that prevents you from changing them in the future and breaking objects that use that class
	 void powerOn();
	 void dial(int phoneNumber);
	 void response();
	 boolean callPhone(int phoneNumber);
	 boolean isRinging();
}
