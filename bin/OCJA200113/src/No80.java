
public class No80 {
	String name;
	double contract;
	double salary;
	No80(){
		//line n1
	}
	public String toString() {
		return name + ":"+contract +" : "+ salary;
	}
	public static void main(String [] args) {
		No80 e = new No80();
		//line 2
		System.out.println(e);
	}
}
