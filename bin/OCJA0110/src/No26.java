
public class No26 {
	void readCard(int cardNo) throws Exception{ //Exception ���� �߰�������
		System.out.println("Reading Book");
	}
	void checkCard(int cardNo) throws RuntimeException { //RuntimeException ���� �߰�������
		System.out.println("checking Card");
	}
	
	public static void main(String []args) {
		No26 ex = new No26();
		int cardNo = 12344;
		ex.checkCard(cardNo);	// ���� �����ϱ� ������ ������ ���� �� �� ���� ���� ( �����Ͽ��� üũ ���� )
		ex.readCard(cardNo);	// Exception�� �����ϴ� ������ ������ ( �������ϴ� ���� ���� ����.[üũ��] ) �׷��� �����߻��� �� ������ ������ �� ��. try catch �ַ��ְų� �ٸ� ����� ����.
	}

}
