class C2{
	public void displayC2() {
		System.out.println("C2");
	}
}
interface I {
	public void displayI();
}
class C1 extends C2 implements I{
	public void displayI() {
		System.out.println("C1");
	}
}
public class No88 {
	C2 obj1 = new C1();
	I obj2 = new C1();
	
	C2 s = obj2;// C2�� C1 �ְ� ����.
	I t = obj1; // I�� C1 Ÿ�� �ְ� ����.
	
	t.displayI();
	s.displayC2();
	
}
