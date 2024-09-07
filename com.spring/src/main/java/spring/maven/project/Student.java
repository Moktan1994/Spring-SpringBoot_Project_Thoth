package spring.maven.project;

public class Student {
	private int studentId;
	private String name;
	private String address;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String name, String addressCity) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.addressCity = addressCity;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddressCity() {
		return addressCity;
	}
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

}
