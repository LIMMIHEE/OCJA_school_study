interface Downloadable{
	public void download();
}
interface Readable extends Downloadable{	//n1
	public void readBook();
}
abstract class Book implements Readable{	//n2
//abstract�� �߻��̾ �װ� �����൵ ��. ��,,,, �� �����ε��̾���
	public void readBook() {
		System.out.println("Read Book");
	}
}
class EBook extneds Book{
	public void readBook() {
		System.out.println("Read E-Book");
	}
}
public class No134 {
	public static void main(String []args) {
		Book book1 = new EBook();
		book1.readBook();
	}
}
