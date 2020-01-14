
public class No79 {
	private char var;
	public static void main(String []args) {
		char var1 = 'a';
		char var2 = var1;
		var2= 'e';
		
		No79 obj1 = new No79();
		No79 obj2 = obj1;	// 둘은 연결되어 있어 값이 같다.
		obj1.var= 'i';
		obj2.var= 'o'; 
		
		System.out.println(var1+", "+var2);
		System.out.println(obj1.var+". "+obj2.var);
		
	}
}
