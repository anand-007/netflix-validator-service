package application.responses;

public class ValidateResponse {
	
	String responseId;
	public String getResponseId() {
		return responseId;
	}

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public String getResponseData() {
		return responseData;
	}

	public void setResponseData(String responseData) {
		this.responseData = responseData;
	}

	String responseData;
	
	public ValidateResponse() {
		// TODO Auto-generated constructor stub
		
		this.responseId="1";
		this.responseData="I am gary bear";
		
		
	}

}
