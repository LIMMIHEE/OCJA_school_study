class Vehicle{
	int x;
	Vehicle(){
		this(10); // line n1
	}
	Vehicle(int x){
		this.x=x;
	}
}
class Car extends Vehicle{
	int y;
	Car(){
		//this();
		super();
		this(20); // line n2
		//this�� �Ϸ��� ���� ó������ �ؾ��Ѵ�. �ٵ� super�� ���� ó������ �������. �׷��� �Ϸ��� this.y=y;���� �־��ֱ�. �ƴϸ� super �����ϱ�.
	}
	Car (int y){
		this.y=y;
	}
	public String toString() {
		return super.x+":"+this.y;
	}
}
public class No68 {
	public static void main(String[]args) {
		Vehicle y = new Car();
		System.out.println(y);
	}
}
