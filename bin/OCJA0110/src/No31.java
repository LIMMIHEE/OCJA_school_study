
public class No31 {
	String name;
	int age=25;
	
	public No31(String name) {
		this();
		setName(name);
	}
	public No31(String name, int age) {
		No31(name);
		setAge(age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//¿©±â¿¡ getter seeter 
	public String show() {
		return name+" " +age+" "+number;
	}
	public static void main(String[]args) {
		No31 p1 = new No31("jass");
		No31 p2 = new No31("weter",23);
		System.out.println(p1.show());
		System.out.println(p2.show());
	}

	
}
