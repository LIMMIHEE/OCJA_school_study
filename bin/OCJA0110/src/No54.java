

class Product{
	double price;
}

public class No54 {
	public void updatePrice(Product product, double price) {
		price = price *2;
		product.price = product.price + price;
	}
	public static void main(String []args) {
		Product prt = new Product();
		prt.price=200;
		double newPrice = 100;
		
		No54 t = new No54();
		t.updatePrice(prt, newPrice);
		System.out.println(prt.price+" : "+newPrice);
	}
}
