interface Downloadable{
	public void download();
}
interface Readable extends Downloadable{	//n1
	public void readBook();
}
abstract class Book implements Readable{	//n2
//abstract는 추상이어서 그거 안해줘도 됨. 그,,,, 그 오버로딩이었나
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
