
public class No26 {
	void readCard(int cardNo) throws Exception{ //Exception 에러 발견했을때
		System.out.println("Reading Book");
	}
	void checkCard(int cardNo) throws RuntimeException { //RuntimeException 에러 발견했을때
		System.out.println("checking Card");
	}
	
	public static void main(String []args) {
		No26 ex = new No26();
		int cardNo = 12344;
		ex.checkCard(cardNo);	// 런은 실헹하기 전에는 에러가 날지 알 수 없기 떄문 ( 컴파일에서 체크 안함 )
		ex.readCard(cardNo);	// Exception은 실행하다 에러가 났을때 ( 컴파일하다 에러 날수 있음.[체크함] ) 그래서 에러발생할 수 있으니 에러가 난 것. try catch 넣러주거나 다른 방법도 있음.
	}

}
