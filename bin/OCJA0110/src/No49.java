
public class No49 {
	int id;
	String name;
	public No49(int id, String name) {
		this.id= id;
		this.name=name;
	}
	public static void main(String []args) {
		No49 p1 = new No49(101,"pen");
		No49 p2 = new No49(101,"pen");
		No49 p3 = p1;
		boolean ans1= p1 ==p2;
		boolean and2 = p1.name.equals(p2.name);
		System.out.println(ans1 + ", "+and2);
	}
	
	
}
