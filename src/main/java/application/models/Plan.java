package application.models;

enum PlanType {
	BASIC, STANDARD, PREMIUM
}

public class Plan {
	
	private PlanType planType;
	public PlanType getPlanType() {
		return planType;
	}
	public void setPlanType(PlanType planType) {
		this.planType = planType;
	}
	public String getPlanId() {
		return planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public int getNumberOfStreams() {
		return numberOfStreams;
	}
	public void setNumberOfStreams(int numberOfStreams) {
		this.numberOfStreams = numberOfStreams;
	}
	public int getNumberOfDownloads() {
		return numberOfDownloads;
	}
	public void setNumberOfDownloads(int numberOfDownloads) {
		this.numberOfDownloads = numberOfDownloads;
	}
	private String planId;
	private int numberOfStreams;
	private int numberOfDownloads;

}
