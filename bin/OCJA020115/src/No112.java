
public class No112 {
	public static void main(String []args) {
		short s1 = 200;
		Integer s2 = 400;
		Long s3=(long) s1+s2;
		String s4 = (String )(s3*s2);	// ��ȯ �Ұ���. toString ������ �������.
		System.out.println("Sun is "+ s4);
	}
}
