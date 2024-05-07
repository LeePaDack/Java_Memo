package ncs.test8;

public class User {

// 필드
	private String id;
	private String passwod;
	private String name;
	private int age;
	private char gender;
	private String phone;
	
// 메서드
	// Getter
	public String getId() {
		return id;
	}

	public String getPasswod() {
		return passwod;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public String getPhone() {
		return phone;
	}
	// Setter
	public void setId(String id) {
		this.id = id;
	}

	public void setPasswod(String passwod) {
		this.passwod = passwod;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// 생성자 기본
	public User() {
	}

	
	// 생성자 필수
	public User(String id, String passwod, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.passwod = passwod;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	// Override toString -> 단축키
	// alt shift s  s enter
	@Override
	public String toString() {
		return "User [id=" + id + ", passwod=" + passwod + ", name=" + name + ", age=" + age + ", "
				+ "gender=" + gender + ", phone=" + phone + ", toString()=" + super.toString() + "]";
	}

	// clone
	// 각체 복사본 Cloneable
	@Override
	public User clone() {
		return new User(this.id, this.passwod, this.name, this.age, this.gender, this.phone);
	}

	
		
		
		
}
