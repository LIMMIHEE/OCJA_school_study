
public class No82 {
	public static int stVar =100;
	public int var = 200;
	public String toString() {
		return var+":"+stVar;
	}
	public static void main(String []args) {
		No82 t1 = new No82();
		t1.var=300;
		System.out.println(t1);
		No82 t2 = new No82();
		t2.stVar=300;
		System.out.println(t2);
		
	}
}
