
class MyException extends RuntimeException{}

public class No56 {
	public static void main(String[]args) {
		try {
			method1();
		}
		catch (MyException ne) {
			System.out.println("A");
		}
	}
	public static void method1() {
		try {
			throw  //throw �ϸ� �׳� �ٷ� catch�� ������/ 
			Math.random() > 0.5  ? new MyException() : new RuntimeException();
		}catch(RuntimeException re) {
			System.out.println("B");
		}
	}
}
