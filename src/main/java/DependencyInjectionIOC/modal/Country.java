package DependencyInjectionIOC.modal;

public class Country {
	private String countryId;
	private String countryName;
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
	public String toString(){
		return ", CountryId : "+this.countryId+", CountryName : "+this.countryName;
	}
}
