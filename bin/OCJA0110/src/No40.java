import java.awt.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class No40 {
	String name;
	int age;
	public No40(String n, int a) {
		name =n;
		age=a;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public static void checkAge(List<No40> list, Predicate<No40> No40) {
		for(No40 p : list) {
			if(No40.test(p)) {
				System.out.println(p.name+" ");
			}
		}
	}
	public static void main(String []args) {
		List<No40> ilist = Arrays.asList(new No40("a",1), new No40("kk",9), new No40("ads",90));
		checkAge(ilist, p -> p.getAge() > 40);
		//여기에 들어갈건?
	}
	
}
