
public class No94 {
	static double area;
	int b=2, h=3;
	public static void main(String []args) {
		double p,b,h;	//line n1		
						// 로컬 변수는 초기값 주어야함.
		if(area==0) {
			b=3;
			h=4;
			p=0.5;
		}
		area=p*b*h;	//line n2
		System.out.println(area);
	}
}
