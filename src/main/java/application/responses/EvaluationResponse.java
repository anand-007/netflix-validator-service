package application.responses;

/**
 * 
 * @author ecom-anandraj.t
 *
 */

public class EvaluationResponse {
	
	private boolean success;
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private String message;

}
