import java.awt.List;
import java.util.ArrayList;

public class No141 {
	public static void main(String []args) {
		List colors = new ArrayList();
		colors.add("greed");
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.remove(2);
		colors.add("cyan",3);
		System.out.println(colors);
	}
}
