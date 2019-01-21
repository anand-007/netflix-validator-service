package application.models;

enum PlanType {
	BASIC, STANDARD, PREMIUM
}

public class Plan {
	
	PlanType planType;
	String planId;
	int numberOfStreams;
	int numberOfDownloads;

}
