
public class No32 {
	public static void main(String []args) {
		No32 ts = new No32();
		System.out.println(isAvailble+" ");
		isAvailble = ts.doStuff();
		System.out.println(isAvailble);
	}
	public static boolean doStuff() {
		return !isAvailble;
	}
	
	static boolean isAvailble = false;
}
