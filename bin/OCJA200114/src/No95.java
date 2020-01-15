
public class No95 {
	public static void main(String[]args) {
		int data []= {2010,2013,2014,2015,2014};
		int key = 2014;
		int count=0;
		for(int e:data) {
			if(e!= key) {
				continue;
				count++;	//컨티뉴가 앞에 있기 때문에 뒤에 문장이 있어도 실행하지 않아 컴파일 에러.
			}
		}
		System.out.println(count + "Found");
	}
}
