import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NO107 {
	public static void main(String[]args) {
		String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
		//parse("2014-05-04") �� �����ε�
		//format(DateTimeFormatter.ISO_DATE_TIME); �� �����̶� ���� �����ؼ� �׷���?
		
		//ISO_DATE_TIME�� static final. �ð��� ǥ���� �ִ°���. �ٵ� parse("2014-05-04")��?????? �ú��� �� ���� ������ �������ؼ� �������°�.
		System.out.println(date);
	}
}
