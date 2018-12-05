package interfaces;

public class Gearbox {
	private boolean clutchIsIn;
	
	public void operateClutch(String inOrOut) {
		//equalsIgnoreCase ignores CASE sensitive
		this.clutchIsIn = inOrOut.equalsIgnoreCase("in"); //This will either return true or false
	}

}
