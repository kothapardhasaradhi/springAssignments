package springDataAccess.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@Column(name="ADDRESS_ID")
	private int Id;
	@Column(name="CITY")
	private String city;
	@Column(name="STATE")
	private String State;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
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
