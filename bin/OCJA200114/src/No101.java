
public class No101 {
	public int amount;
	public No101(int amount) {
		this.amount=amount;
	}
	public int getAmount() {
		return amount;
	}
	public void changeAmount(int x) {
		amount += x;
	}
	
	public static void main(String []args) {
		No101 acct = new No101((int) (Math.random()*1000));
		//line n1
		
		//static 있으면 this 사용불가..?
		System.out.print(acct.getAmount());
	}
}
