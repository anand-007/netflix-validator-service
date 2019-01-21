package application.models;


public class Viewable implements IValidateModel{
	
	private String playBackId;
	private String playBackUrl;
	private int minimumSupportedResolution;
	private String ratingId;
	private boolean requiresAdultVerification;
	private MaturityLevel maturityLevel;
	private Country country;
	
	public String getPlayBackId() {
		return playBackId;
	}
	public void setPlayBackId(String playBackId) {
		this.playBackId = playBackId;
	}
	public String getPlayBackUrl() {
		return playBackUrl;
	}
	public void setPlayBackUrl(String playBackUrl) {
		this.playBackUrl = playBackUrl;
	}
	public int getMinimumSupportedResolution() {
		return minimumSupportedResolution;
	}
	public void setMinimumSupportedResolution(int minimumSupportedResolution) {
		this.minimumSupportedResolution = minimumSupportedResolution;
	}
	public String getRatingId() {
		return ratingId;
	}
	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}
	public boolean isRequiresAdultVerification() {
		return requiresAdultVerification;
	}
	public void setRequiresAdultVerification(boolean requiresAdultVerification) {
		this.requiresAdultVerification = requiresAdultVerification;
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
	

}
