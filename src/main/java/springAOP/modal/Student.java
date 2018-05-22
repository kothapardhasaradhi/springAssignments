package springAOP.modal;

public class Student {
	private String studentId ;
	private String studentName;
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
