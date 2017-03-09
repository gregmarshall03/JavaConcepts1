
public class Info {
	private String name;
	private String address;
	private int age;
	private String phoneNumber;
public Info(String name, String address, int age, String phone) {
		
		this.name = name;
		this.address = address;
		this.age = age;
		this.phoneNumber = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Info() {
		// TODO Auto-generated constructor stub
	}

	

}
