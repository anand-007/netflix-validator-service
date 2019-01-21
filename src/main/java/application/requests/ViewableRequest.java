package application.requests;

import application.models.Country;
import application.models.MaturityLevel;

/**
 * 
 * @author ecom-anandraj.t
 *
 */

public class ViewableRequest implements IModelRequest{
	
	private String playBackId;
	private int resolution;
	private String ratingId;
	private MaturityLevel maturityLevel;
	private Country country;
	private String userPin;
	private MaturityLevel pinMaturityLevel;
	private String actualPin;
	
	public String getUserPin() {
		return userPin;
	}
	public void setUserPin(String userPin) {
		this.userPin = userPin;
	}
	
	public String getPlayBackId() {
		return playBackId;
	}
	public void setPlayBackId(String playBackId) {
		this.playBackId = playBackId;
	}
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public String getRatingId() {
		return ratingId;
	}
	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}
	public MaturityLevel getMaturityLevel() {
		return maturityLevel;
	}
	public void setMaturityLevel(MaturityLevel maturityLevel) {
		this.maturityLevel = maturityLevel;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public MaturityLevel getPinMaturityLevel() {
		return pinMaturityLevel;
	}
	public void setPinMaturityLevel(MaturityLevel pinMaturityLevel) {
		this.pinMaturityLevel = pinMaturityLevel;
	}
	public String getActualPin() {
		return actualPin;
	}
	public void setActualPin(String actualPin) {
		this.actualPin = actualPin;
	}

}
