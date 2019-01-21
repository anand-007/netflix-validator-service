package application.models;

import java.util.List;



public class Member implements IValidateModel{
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEncodedPassword() {
		return encodedPassword;
	}
	public void setEncodedPassword(String encodedPassword) {
		this.encodedPassword = encodedPassword;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean isAdultVerified() {
		return adultVerified;
	}
	public void setAdultVerified(boolean adultVerified) {
		this.adultVerified = adultVerified;
	}
	public String getProfileLanguage() {
		return profileLanguage;
	}
	public void setProfileLanguage(String profileLanguage) {
		this.profileLanguage = profileLanguage;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public Plan getPlanDetails() {
		return planDetails;
	}
	public void setPlanDetails(Plan planDetails) {
		this.planDetails = planDetails;
	}
	public PlayBackSettings getSettings() {
		return settings;
	}
	public void setSettings(PlayBackSettings settings) {
		this.settings = settings;
	}
	public MaturityLevel getPinMaturityLevel() {
		return pinMaturityLevel;
	}
	public void setPinMaturityLevel(MaturityLevel pinMaturityLevel) {
		this.pinMaturityLevel = pinMaturityLevel;
	}
	public MaturityLevel getLevel() {
		return level;
	}
	public void setLevel(MaturityLevel level) {
		this.level = level;
	}
	public MemberStatus getStatus() {
		return status;
	}
	public void setStatus(MemberStatus status) {
		this.status = status;
	}
	public List<Stream> getActiveStreams() {
		return activeStreams;
	}
	public void setActiveStreams(List<Stream> activeStreams) {
		this.activeStreams = activeStreams;
	}
	public Payment getPaymentInformation() {
		return paymentInformation;
	}
	public void setPaymentInformation(Payment paymentInformation) {
		this.paymentInformation = paymentInformation;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	private String memberId;
	private String name;
	private String email;
	private String encodedPassword;
	private String phoneNumber;
	private boolean adultVerified;
	private String profileLanguage;
	private String pin;
	private Plan planDetails;
	private PlayBackSettings settings;
	private MaturityLevel pinMaturityLevel;
	private MaturityLevel level;
	private MemberStatus status;
	private List<Stream> activeStreams;
	private Payment paymentInformation;
	public Country getUserCountry() {
		return userCountry;
	}
	public void setUserCountry(Country userCountry) {
		this.userCountry = userCountry;
	}
	private Country userCountry;
	
	
}
