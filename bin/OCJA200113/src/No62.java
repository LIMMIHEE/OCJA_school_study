
class Student{
	String name;
	public Student(String name) {
		this.name= name;
	}
}

public class No62 {
	public static void main(String []args) {
		Student [] students = new Student[3];
		students[1] = new Student("R");
		students[2] = new Student("D");
		for(Student s: students) {
			System.out.println(" "+s.name);
		}
	}
}
