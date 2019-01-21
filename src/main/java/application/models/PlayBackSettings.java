package application.models;

enum DataUsageType {
	AUTO, LOW, MEDIUM, HIGH
}

public class PlayBackSettings {
	
	boolean autoPlay;
	DataUsageType dataUsageType;

}
