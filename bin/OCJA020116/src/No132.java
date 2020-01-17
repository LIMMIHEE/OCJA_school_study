
public class No132 {
	int num;
	public static void graceMarks (No132 obj4) {
		obj4.num += 10;
	}
	public static void main(String[]args) {
		No132 obj1 = new No132();	// 객체는 얘 하나 생김.
		No132 obj2 = obj1;	//변수에다 주소만 넣는거
		No132 obj3 = null;	//변수에 널 넣기.
		obj2.num=60;
		graceMarks(obj2);
		
	}
}
