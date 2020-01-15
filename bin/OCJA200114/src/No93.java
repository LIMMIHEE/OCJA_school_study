class Caller{
	private void init() {
		System.out.println("Initalized");
	}
	
	private void start() {
		init();
		System.out.println("Started");
	}
}

public class No93 {
	public static void main(String []args) {
		Caller c = new Caller();
		c.start(); //private는 다른 클래스에서 사용 할 수 없다.
		c.init();
	}
}
