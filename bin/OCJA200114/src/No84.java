
class CD{
	int r;
	CD(int t){
		this.r=r;
	}
}
class DVD extends CD{
	int c;
	DVD(int r,int c){
		//line n1
	}
}

public class No84 {
	public static void main(String []args) {
		DVD dvd = new DVD(10,20);
	}
}
