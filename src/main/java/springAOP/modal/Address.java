package springAOP.modal;

public class Address {
		
	private String city;
	private String State;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString(){
		return " City= "+this.city+", State = "+this.State;
	}
}
