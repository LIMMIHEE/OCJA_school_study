
public class No115 {
	public static void main(String []args) {
		String name[]= {"Thomas","Peter","Joseph"};
		String pws[]= new String [3];
		int idx =0;
		try {
			for(String n: name) {
				pws[idx]= n.substring(2,6);	//substring �����ڸ���. (����, ��)
				idx++;
			}
		}catch (Exception e){
			System.out.println("Invalid Name");
		}
		for(String p:pws) {
			System.out.print(p);
		}
	}
}
