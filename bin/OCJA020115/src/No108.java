
public class No108 {
	public static void main(String[]args) {
		String str=" ";
		str.trim();	// 안 넣어줌. 그래서 여전히 " " 상태.
		System.out.println(str.equals("") + " "+ str.isEmpty());
		//isEmpty 는 배열이 비어있는 지 확인하는 거.
	}
}
