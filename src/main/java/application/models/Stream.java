package application.models;

enum StreamType{
	TV, DeskTop, Mobile
}

public class Stream {
	
	StreamType type;
	public StreamType getType() {
		return type;
	}
	public void setType(StreamType type) {
		this.type = type;
	}
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
	String streamId;
	Device deviceDetails;

}
