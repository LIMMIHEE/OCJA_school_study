import java.time.LocalDate;

public class No98 {
	public static void main(String []args) {
		LocalDate date = LocalDate.of(2012, 01,32);		//32���� ��� �����ϸ鼭 ��Ÿ�� ������ ����
		date.plusDays(10);
		System.out.println(date);
	}
}
