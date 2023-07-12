package program;

class Teacher{
	int id;
	String name;
	String subject;
	
	void teach() {
		System.out.println("Teacher is teaching");
	}
	void motivate(){
		System.out.println("Teacher is motivating students");
	}
	void giveAssignment(){
		System.out.println("Teacher is giving Assignments");
	}
}

class Demo{
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.id=12;
		t1.name="ram";
		t1.subject="java";
		t1.teach();
		t1.motivate();
		t1.giveAssignment();
		
	}
}
