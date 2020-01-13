

class A{
	public A() {
		System.out.println("A ");
	}
}

class B extends A{
	public B() {
		System.out.println("B ");
	}
}

public class No47 extends B{
	public No47() {
		System.out.println("C ");
	}
	public static void main(String []args) {
		No47 n4 = new No47();
	}
	
}
