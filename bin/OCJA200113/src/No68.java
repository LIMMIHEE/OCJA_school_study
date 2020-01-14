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
		//this를 하려면 제일 처음으로 해야한다. 근데 super도 제일 처음으로 해줘야함. 그래서 하려면 this.y=y;같이 넣어주기. 아니면 super 삭제하기.
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
