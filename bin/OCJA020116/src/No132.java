
public class No132 {
	int num;
	public static void graceMarks (No132 obj4) {
		obj4.num += 10;
	}
	public static void main(String[]args) {
		No132 obj1 = new No132();	// ��ü�� �� �ϳ� ����.
		No132 obj2 = obj1;	//�������� �ּҸ� �ִ°�
		No132 obj3 = null;	//������ �� �ֱ�.
		obj2.num=60;
		graceMarks(obj2);
		
	}
}
