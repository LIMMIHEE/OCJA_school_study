
public class No97 {
	public static void main(String []args) {
		int n[][]= {{1,3},{2,4}};
		for(int i =n.length-1; i>=0; i-- ) {//n.length = 행이 몇 개냐.
			for(int y: n[i]) {// n[1]= {2,4}
				System.out.println(y);	
			}
		}
	}
}
