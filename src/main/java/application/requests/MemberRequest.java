package application.requests;

/**
 * 
 * @author ecom-anandraj.t
 *
 */

public class MemberRequest implements IModelRequest{
	
	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	private int pin;

}
