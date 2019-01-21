package application.requests;

import java.util.List;

/**
 * 
 * @author ecom-anandraj.t
 *
 */

public class ValidateRequest {
	
	private String memberId;
	private String deviceId;
	private String playBackId;
	private String userPin;
	private List<String> excludeTypes;

	public List<String> getExcludeTypes() {
		return excludeTypes;
	}
	public void setExcludeTypes(List<String> excludeTypes) {
		this.excludeTypes = excludeTypes;
	}
	public String getUserPin() {
		return userPin;
	}
	public void setUserPin(String userPin) {
		this.userPin = userPin;
	}

	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getPlayBackId() {
		return playBackId;
	}
	public void setPlayBackId(String playBackId) {
		this.playBackId = playBackId;
	}	
	public boolean isValidRequest() {
		if(this.deviceId!=null && this.memberId!=null && this.playBackId!=null) {
			return true;
		}
		return false;
	}
	
}
