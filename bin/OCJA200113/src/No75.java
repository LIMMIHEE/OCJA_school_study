
public class No75 {
	String name;
	int age=25;
	public No75(String name) {
		this();//�� �� �ִ°� ����.
		setName(name);
	}
	public No75(String name, int age) {
		No75(name); // this()�� �ؾ���.�ƴϸ� this.name= name���� �ϰų�
		setAge(age);
	}
	//���� ����
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
