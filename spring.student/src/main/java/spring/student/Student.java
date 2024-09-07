package spring.student;

public class Student {

	public Address address;

	public Student() {

	}

	public Student(Address address) {
		System.out.println("Hitting constructor");
		this.address = address;
	}

	public Address getAddress() {
		System.out.println("Hitting getter method");
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Hitting setter method");
		this.address = address;
	}
	public void studentDetails() {
		System.out.println("Address of the student "+ address.city);
	}

	
}
