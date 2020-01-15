
public class No105 {
	public static void main(String []args) {
		boolean opt = true;
		//		-> String opt="true";
		switch(opt) {	//boolean 타입만 넣을 수 없다.
		case true:	// 문자형식인 "true"로 수정
			System.out.println("true");
			break;
		default:
			System.out.println("false");
			break;
		}
		System.out.println("Don");
	}
}
