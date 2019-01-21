package application.requests;

import application.models.Country;
import application.models.MaturityLevel;

public class ViewableRequest implements IModelRequest{
	
	String playBackId;
	int resolution;
	String ratingId;
	MaturityLevel maturityLevel;
	Country country;
	
}
