

//문제가 이상함..........

class A{
	public void test() {
		System.out.println("A");
	}
}
class B extends A{
	public void test() {
		System.out.println("B");
	}
}

public class No104 extends A{
	public void test () {
		System.out.println("C");
	}
	public static void main(String []args) {
		A b1 = new A();
		A b2 = new No104();
		b1 = (A) b2;
		A b3 =(B) b2;	//line n1
		A b3 =(B) b2;	//line n2
		b1.test();
		b3.test();
		
		
	}
}
