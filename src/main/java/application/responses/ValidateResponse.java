package application.responses;

/**
 * 
 * @author ecom-anandraj.t
 *
 */

public class ValidateResponse {
	
	public boolean isValidatedResult() {
		return validatedResult;
	}


	public void setValidatedResult(boolean validatedResult) {
		this.validatedResult = validatedResult;
	}


	public String getValidatedMessage() {
		return validatedMessage;
	}


	public void setValidatedMessage(String validatedMessage) {
		this.validatedMessage = validatedMessage;
	}


	private boolean validatedResult;
	private String validatedMessage;
	private final String SUCCESS_MESSAGE = "Request is valid";

	
	public ValidateResponse(boolean validatedResult, String validatedMessage) {
		// TODO Auto-generated constructor stub
		
		if(validatedMessage==null) {
			this.validatedMessage = SUCCESS_MESSAGE;
		} else {
			this.validatedMessage = validatedMessage;
		}
		this.validatedResult = validatedResult;		
		
	}

}
