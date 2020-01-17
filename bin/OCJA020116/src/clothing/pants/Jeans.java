package clothing.pants;
//line n1
public class Jeans {
	public void matchShirt() {
		//line n2
		if(color.equals("Green")) {
			System.out.println("Fit");
		}
	}
	public static void main(String []args) {
		Jeans trouser = new Jeans();
		trouser.matchShirt();
	}
}
