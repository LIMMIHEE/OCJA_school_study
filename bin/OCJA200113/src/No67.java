import java.util.ArrayList;

public class No67 {
	public static void main(String [] args) {
		ArrayList myList = new ArrayList();
		String [] myArray;
		try {
			while(true) {
				myList.add("My String");
			}
		}catch(RuntimeException re) {
			System.out.println("caught a RuntimeException");
		}
		catch(Exception e) {
			System.out.println("caught an Exception");
		}
		System.out.println("Ready to use");
	}
}

//1.
//2.
//3. 메인에서 런타임에러가 난다.
//4.
//5.
