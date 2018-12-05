package interfaces;

public class Phone implements ITelephone {
//implements is the keyword used to implement interfaces to classes
	private int myNumber;
	private boolean isRinging;
	
	public Phone(int myNumber) {
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		System.out.println("The phone is now on.");
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Dialing to " + phoneNumber);
		
	}

	@Override
	public void response() {
		if (isRinging) {
			System.out.println("Hey!");
			isRinging = false;
		}
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if (phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("Ring...");
		} else isRinging = false;
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		return isRinging;
	}

}
