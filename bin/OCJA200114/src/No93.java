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
		c.start(); //private�� �ٸ� Ŭ�������� ��� �� �� ����.
		c.init();
	}
}
