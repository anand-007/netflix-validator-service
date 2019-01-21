package application.models;

/**
 * Country Model 
 * @author ecom-anandraj.t
 *
 */

public class Country {
	
	private String countryId;
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	private String countryName;
	
	public Country(String countryId, String countryName){
		this.countryId = countryId;
		this.countryName = countryName;
	}

}
