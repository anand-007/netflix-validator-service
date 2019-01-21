package application.models;

import java.util.List;

 enum MemberStatus{
	ACTIVE, INACTIVE, PENDING
}

public class Member implements IValidateModel{
	
	String name;
	String email;
	String encodedPassword;
	String phoneNumber;
	boolean adultVerified;
	String profileLanguage;
	String pin;
	Plan planDetails;
	PlayBackSettings settings;
	MaturityLevel pinMaturityLevel;
	MaturityLevel level;
	MemberStatus status;
	List<Stream> activeStreams;
	Payment paymentInformation;
	
	
}
