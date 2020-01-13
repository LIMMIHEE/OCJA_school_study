
public class No53 {
	int ns;
	static int s;
	No53 (int ns){
		if(s<ns) {
			s=ns;
			this.ns = ns;
		}
	}
	void doprint() {
		System.out.println("ns = "+ns + " s = "+s);
	}
	public static void main(String[]args) {
		No53 ref1 = new No53(50);
		No53 ref2 = new No53(125);
		No53 ref3 = new No53(100);
		
		ref1.doprint();
		ref2.doprint();
		ref3.doprint();
	}
}
