
public class No46 {
	int count;
	
	public static void displayMsg() { //static �� ������ count�� �� �ϳ����߸� �ϱ� ������( �򰥷��ϱ� ������ ) ������ ����.	count�� static ���̸� �ذ� �Ϸ�
		count++;
		System.out.println("Welcome "+ "Visit Count : "+count);
	}
	public static void main(String []args) {
		No46.displayMsg();
		No46.displayMsg();
   }
}
