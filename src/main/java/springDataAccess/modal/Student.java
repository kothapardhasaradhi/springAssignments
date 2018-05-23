package springDataAccess.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Student {
	
	@Id
	@Column(name="STUDENT_ID")
	private String studentId ;
	@Column(name="SYUDENT_NAME")
	private String studentName;
	@ManyToOne
	@JoinColumn(name="ADDRESS_ID")
	private Address address;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString(){
		return "studentId = "+this.studentId+", studentName = "+this.studentName+", student Address = "+this.address.toString();
	}
}
