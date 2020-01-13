
public class No51 {
	static int count =0;
	int i=0;
	public void changeCount() {
		while(i<5) {
			i++;
			count++;
		}
	}
	
	public static void main(String []args) {
		No51 check1 = new No51();
		No51 check2 = new No51();
		check1.changeCount();
		check2.changeCount();
		System.out.println(check1.count + " : " +check2.count);
	}
}
