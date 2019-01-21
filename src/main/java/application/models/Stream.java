package application.models;

enum StreamType{
	TV, DeskTop, Mobile
}

public class Stream {
	
	StreamType type;
	String streamId;
	Device deviceDetails;

}
