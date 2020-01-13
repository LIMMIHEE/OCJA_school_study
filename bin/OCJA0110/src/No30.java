import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class No30 {
	public static void main(String []args) {
		LocalDateTime dt = LocalDateTime.of(2014,7,31,1,1);
		dt.plusDays(30); // 값을 더해도 다시 DT에  안넣어서 바뀌지 않음.
		dt.plusMonths(1);
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
	}
}
