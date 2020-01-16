abstract class Planet{
	public void revolve() {
		
	}
	abstract void rotate();
}
class Earth extends Planet{
	void revolve() { // 상속 받은건 위에 있는 것보다  범위가 작으면 안됨.
		
	}
	protected void rotate() {
		
	}
}
public class No120 {
	
}
