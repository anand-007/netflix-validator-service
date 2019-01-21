package application.models;

/**
 * Device Model Data
 * @author ecom-anandraj.t
 *
 */

public class Device implements IValidateModel{
	
	private String deviceId;
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public int getMaxSupportedResolution() {
		return maxSupportedResolution;
	}
	public void setMaxSupportedResolution(int maxSupportedResolution) {
		this.maxSupportedResolution = maxSupportedResolution;
	}
	private String deviceType;
	private String deviceName;
	private int maxSupportedResolution;
	
}
