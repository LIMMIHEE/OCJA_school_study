
public class No123 {
	int x,y;
	public No123(int x, int y) {
		initialize(x,y);
	}
	public void initialize(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public static void main(String []args) {
		int x=3,y=5;
		No123 obj = new No123(x,y);
		System.out.println(x+" : "+y);
	}
}
