package p1;

public class Test {
	public static void main(String[]args) {
		System.out.println("Hello "+ new StringBuilder("Java SE 8"));
		System.out.println("Hello "+ new MyString("Java SE 8"));
		//원래 스트링으로 나오게 하려면 어쩌구.....................
		//아마 미리 객체 만들어서 하나는 말인듯. 그래고 나서 mystr.msg 같이 ... 
	}
}
