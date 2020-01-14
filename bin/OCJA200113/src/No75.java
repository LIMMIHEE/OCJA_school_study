
public class No75 {
	String name;
	int age=25;
	public No75(String name) {
		this();//할 수 있는게 없음.
		setName(name);
	}
	public No75(String name, int age) {
		No75(name); // this()로 해야함.아니면 this.name= name으로 하거나
		setAge(age);
	}
	//세터 게터
	public String show() {
		return name+" "+age;
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
	public static void main(String []args) {
		No75 p1 = new No75("J");
		No75 p2 = new No75("w",52);
		System.out.println(p1.show());
		System.out.println(p2.show());
	}
}
