import java.util.ArrayList;
import java.util.List;

public class No69 {
	public static void main(String []args) {
		List <String> names = new ArrayList<>();
		names.add("robb");
		names.add("Bran");
		names.add("rick");
		names.add("Bran");
		
		if(names.remove("Bran")) {
			names.remove("Jon"); // ��� ���� �Ұ� ����. �Ѿ.
		}
		System.out.println(names);
	}
}
