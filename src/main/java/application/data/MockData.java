package application.data;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import application.models.Country;
import application.models.Device;
import application.models.MaturityLevel;
import application.models.MaturityType;
import application.models.Member;
import application.models.MemberStatus;
import application.models.Plan;
import application.models.Stream;
import application.models.Viewable;

/**
 * Holds mock data replicating the database data of member, device and videos
 * @author ecom-anandraj.t
 *
 */

public class MockData {
	
	public static Hashtable<String, Device> deviceMap;
	public static Hashtable<String, Member> memberMap;
	public static Hashtable<String, Viewable> viewableMap;

	
	public static void initializeData() {
		
		deviceMap = new Hashtable<String, Device>();
		memberMap = new Hashtable<String, Member>();
		viewableMap = new Hashtable<String, Viewable>();
		
		Device d1 = new Device();
		d1.setDeviceId("1");
		d1.setDeviceName("Samsung");
		d1.setDeviceType("Mobile");
		d1.setMaxSupportedResolution(700);
		
		Device d2 = new Device();
		d2.setDeviceId("2");
		d2.setDeviceName("Samsung");
		d2.setDeviceType("Mobile");
		d2.setMaxSupportedResolution(500);
		
		Device d3 = new Device();
		d3.setDeviceId("3");
		d3.setDeviceName("Mac");
		d3.setDeviceType("Desktop");
		d3.setMaxSupportedResolution(1200);
		
		Device d4 = new Device();
		d4.setDeviceId("4");
		d4.setDeviceName("Apple");
		d4.setDeviceType("Tablet");
		d4.setMaxSupportedResolution(1000);
		
		
		Device d5 = new Device();
		d5.setDeviceId("5");
		d5.setDeviceName("Apple");
		d5.setDeviceType("Tablet");
		d5.setMaxSupportedResolution(1800);

		deviceMap.put(d1.getDeviceId(), d1);
		deviceMap.put(d2.getDeviceId(), d2);
		deviceMap.put(d3.getDeviceId(), d3);
		deviceMap.put(d4.getDeviceId(), d4);
		deviceMap.put(d5.getDeviceId(), d5);

		
		Member m1 = new Member();
		m1.setName("A");
		m1.setEmail("a@gmail.com");
		List<Stream> streamList = new ArrayList<Stream>();
		Stream s1 = new Stream();
		s1.setDeviceDetails(d1);
		Stream s2 = new Stream();
		s1.setDeviceDetails(d2);
		streamList.add(s1);
		streamList.add(s2);
		m1.setActiveStreams(streamList);
		m1.setPin("7087");
		MaturityLevel mLevel = new MaturityLevel();
		mLevel.setType(MaturityType.TEEN);
		m1.setLevel(mLevel);
		Plan mPlan = new Plan();
		mPlan.setNumberOfDownloads(1);
		mPlan.setNumberOfStreams(3);
		m1.setPlanDetails(mPlan);
		m1.setUserCountry(new Country("1", "USA"));
		m1.setStatus(MemberStatus.ACTIVE);
		m1.setMemberId("1");
		
		Member m2 = new Member();
		m2.setName("B");
		m2.setEmail("b@gmail.com");
		List<Stream> streamList1 = new ArrayList<Stream>();
		Stream s3 = new Stream();
		s1.setDeviceDetails(d1);
		streamList1.add(s3);
		m2.setActiveStreams(streamList1);
		MaturityLevel mLevel1 = new MaturityLevel();
		mLevel1.setType(MaturityType.ADULT);
		m2.setLevel(mLevel1);
		Plan mPlan1 = new Plan();
		mPlan1.setNumberOfDownloads(1);
		mPlan1.setNumberOfStreams(1);
		m2.setPlanDetails(mPlan1);
		m2.setUserCountry(new Country("2", "IN"));
		m2.setStatus(MemberStatus.INACTIVE);
		m2.setMemberId("2");
		
		Member m3 = new Member();
		m3.setName("C");
		m3.setEmail("c@gmail.com");
		List<Stream> streamList2 = new ArrayList<Stream>();
		Stream s4 = new Stream();
		s4.setDeviceDetails(d1);
		streamList2.add(s4);
		m3.setActiveStreams(streamList2);
		MaturityLevel mLevel2 = new MaturityLevel();
		mLevel2.setType(MaturityType.ADULT);
		m3.setLevel(mLevel2);
		Plan mPlan2 = new Plan();
		mPlan2.setNumberOfDownloads(1);
		mPlan2.setNumberOfStreams(1);
		m3.setPlanDetails(mPlan2);
		m3.setUserCountry(new Country("2", "IN"));
		m3.setStatus(MemberStatus.ACTIVE);
		m3.setMemberId("3");
		
		Member m4 = new Member();
		m4.setName("D");
		m4.setPin("8088");
		m4.setEmail("d@gmail.com");
		List<Stream> streamList3 = new ArrayList<Stream>();
		Stream s5 = new Stream();
		s5.setDeviceDetails(d1);
		streamList3.add(s4);
		m4.setActiveStreams(streamList3);
		MaturityLevel mLevel4 = new MaturityLevel();
		mLevel4.setType(MaturityType.ADULT);
		m4.setLevel(mLevel4);
		Plan mPlan3 = new Plan();
		mPlan3.setNumberOfDownloads(2);
		mPlan3.setNumberOfStreams(2);
		m4.setPlanDetails(mPlan3);
		m4.setUserCountry(new Country("1", "US"));
		m4.setStatus(MemberStatus.ACTIVE);
		m4.setMemberId("4");
		MaturityLevel mLevel5 = new MaturityLevel();
		mLevel5.setType(MaturityType.ADULT);
		m4.setPinMaturityLevel(mLevel5);
		
		Member m5 = new Member();
		m5.setName("E");
		m5.setPin("8088");
		m5.setEmail("d@gmail.com");
		List<Stream> streamList4 = new ArrayList<Stream>();
		Stream s6 = new Stream();
		s6.setDeviceDetails(d1);
		streamList4.add(s6);
		m5.setActiveStreams(streamList4);
		MaturityLevel mLevel6 = new MaturityLevel();
		mLevel6.setType(MaturityType.ADULT);
		m5.setLevel(mLevel6);
		Plan mPlan4 = new Plan();
		mPlan4.setNumberOfDownloads(2);
		mPlan4.setNumberOfStreams(2);
		m5.setPlanDetails(mPlan4);
		m5.setUserCountry(new Country("1", "US"));
		m5.setStatus(MemberStatus.ACTIVE);
		m5.setMemberId("6");
		MaturityLevel mLevel7 = new MaturityLevel();
		mLevel7.setType(MaturityType.OLDERKIDS);
		m5.setPinMaturityLevel(mLevel7);

		memberMap.put(m1.getMemberId(), m1);
		memberMap.put(m2.getMemberId(), m2);
		memberMap.put(m3.getMemberId(), m3);
		memberMap.put(m4.getMemberId(), m4);
		memberMap.put(m5.getMemberId(), m5);
	
		Viewable view1 = new Viewable();
		view1.setPlayBackId("video1");
		view1.setMinimumSupportedResolution(500);
		view1.setCountry(new Country("2", "India"));
		MaturityLevel mVLevel = new MaturityLevel();
		mVLevel.setType(MaturityType.LITTLEKIDS);
		view1.setMaturityLevel(mVLevel);
		
		Viewable view2 = new Viewable();
		view2.setPlayBackId("video2");
		view2.setMinimumSupportedResolution(1500);
		view2.setCountry(new Country("1", "USA"));
		MaturityLevel mVLevel2 = new MaturityLevel();
		mVLevel2.setType(MaturityType.LITTLEKIDS);
		view2.setMaturityLevel(mVLevel2);
		
		Viewable view3 = new Viewable();
		view3.setPlayBackId("video3");
		view3.setMinimumSupportedResolution(400);
		view3.setCountry(new Country("1", "USA"));
		MaturityLevel mVLevel3 = new MaturityLevel();
		mVLevel3.setType(MaturityType.ADULT);
		view3.setMaturityLevel(mVLevel3);
		
		Viewable view4 = new Viewable();
		view3.setPlayBackId("video3");
		view3.setMinimumSupportedResolution(400);
		view3.setCountry(new Country("1", "USA"));
		MaturityLevel mVLevel4 = new MaturityLevel();
		mVLevel4.setType(MaturityType.ADULT);
		view3.setMaturityLevel(mVLevel4);
		
		
		viewableMap.put(view1.getPlayBackId(), view1);
		viewableMap.put(view2.getPlayBackId(), view2);
		viewableMap.put(view3.getPlayBackId(), view3);


	}
	
	public static Device getDeviceDataById(String id) {
		return deviceMap.get(id);
	} 
	
	public static Member getMemberDataById(String id) {
		return memberMap.get(id);
	}
	
	public static Viewable getViewDataById(String id) {	
		return viewableMap.get(id);
	}

}
