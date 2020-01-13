
public class No46 {
	int count;
	
	public static void displayMsg() { //static 이 붇으면 count는 딱 하나여야만 하기 때문에( 헷갈려하기 때문에 ) 에러가 난다.	count에 static 붙이면 해결 완료
		count++;
		System.out.println("Welcome "+ "Visit Count : "+count);
	}
	public static void main(String []args) {
		No46.displayMsg();
		No46.displayMsg();
   }
}
