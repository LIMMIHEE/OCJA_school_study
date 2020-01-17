interface Readable{
	public void readBook();
	public void setBookMark();
}
abstract class Book implements Readable{	//line n1
	public void readBook() {}
	//line n2
}
class EBook extends Book{	//line n3
	public void readBook() {}
	//line n4
}

public class No130 {
	
}
