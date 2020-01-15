import java.time.LocalDate;

public class No98 {
	public static void main(String []args) {
		LocalDate date = LocalDate.of(2012, 01,32);		//32일은 없어서 실행하면서 런타임 에러가 난다
		date.plusDays(10);
		System.out.println(date);
	}
}
