package application.requests;

import application.models.Device;
/**
 * 
 * @author ecom-anandraj.t
 *
 */

public class DeviceRequest implements IModelRequest{

	private String streamId;
	public String getStreamId() {
		return streamId;
	}
	public void setStreamId(String streamId) {
		this.streamId = streamId;
	}
	public Device getDeviceDetails() {
		return deviceDetails;
	}
	public void setDeviceDetails(Device deviceDetails) {
		this.deviceDetails = deviceDetails;
	}
	public int getPlayBackId() {
		return playBackId;
	}
	public void setPlayBackId(int playBackId) {
		this.playBackId = playBackId;
	}
	public int getViewResolution() {
		return viewResolution;
	}
	public void setViewResolution(int viewResolution) {
		this.viewResolution = viewResolution;
	}
	private Device deviceDetails;
	private int playBackId;
	private int viewResolution;
	
}
