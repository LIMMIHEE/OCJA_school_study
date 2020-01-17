import java.awt.List;
import java.util.ArrayList;

class Parient{
	String name;
	public Parient(String name) {
		this.name=name;
	}
}
public class No138 {
	public static void main(String []args) {
		List ps = new ArrayList();
		Parient p2 = new Parient("Mike");
		ps.add(p2);
		
		//insert code
		
		if(f>= 0) {
			System.out.println("Mike Found");
		}
	}
}
//A 정답
//B. 오브젝트 넣어야하는데 new가 없어서 안됨
//C. 괄고가 없어서 안됨.
//D. f의 타입이 int 가 아닌 Int하고 되어있음.