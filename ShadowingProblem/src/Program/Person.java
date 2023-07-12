package Program;

public class Person {
	int id;
	String name;
	String gender;
	String email;
	int phone;
	public Person(int id, String name, String gender, String email, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}
	
	void eat() {
		System.out.println(name+"Is Eating.....");
	}
	void sleep() {
		System.out.println(gender+" "+name+"Is Sleeping");
	}
}
