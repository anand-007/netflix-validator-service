package application.models;


public class Viewable implements IValidateModel{
	
	String playBackId;
	String playBackUrl;
	int minimumSupportedResolution;
	String ratingId;
	boolean requiresAdultVerification;
	MaturityLevel maturityLevel;
	Country country;

}
