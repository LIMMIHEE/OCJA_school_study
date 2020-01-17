package No133;

public class Acc {
	int p;	//디폴트. 
	//아무런 접근 제한자를 명시하지 않으면 default 값이 되며, 동일한 패키지 내에서만 접근이 가능
	private int q;
	protected int r;
	//동일한 패키지 내에 존재하거나 파생클래스에서만 접근 가능
	public int s;
	
}
