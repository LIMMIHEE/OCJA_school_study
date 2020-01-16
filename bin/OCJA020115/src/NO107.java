import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NO107 {
	public static void main(String[]args) {
		String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
		//parse("2014-05-04") 도 설정인데
		//format(DateTimeFormatter.ISO_DATE_TIME); 도 설정이라 둘이 같이해서 그런가?
		
		//ISO_DATE_TIME이 static final. 시간을 표현해 주는거임. 근데 parse("2014-05-04")에?????? 시분이 들어가 있지 않은제 넣으려해서 에러나는거.
		System.out.println(date);
	}
}
