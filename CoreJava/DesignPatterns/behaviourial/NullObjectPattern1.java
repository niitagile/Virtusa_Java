package Design_pattern.behaviourial;
 abstract class Shop {
	 
	 public abstract void discountedProduct();
	 
	 public abstract boolean noDiscount();
	 
	}
 class Product extends Shop {
	 
	 String name;
	 
	 public Product(String name) {
	 this.name = name;
	 }
	 
	 @Override
	 public void discountedProduct() {
	 System.out.println("10% Discount");
	 }
	 
	 @Override
	 public boolean noDiscount() {
	 return false;
	 }
	 
	}
 class NullProduct extends Shop {
	 
	 @Override
	 public void discountedProduct() {
	 System.out.println("No Discount on this item!");
	 }
	 
	 @Override
	 public boolean noDiscount() {
	 return true;
	 }
	 
	}
 class ProductFactory {
	 
	 public static final String[] names = { "Shoes", "TShirt", "Jeans", "Bag", "Sack" };
	 
	 public static Shop getProduct(String name) {
	 
	 for (int i = 0; i < names.length; i++) {
	 if (names[i].equalsIgnoreCase(name)) {
	 return new Product(name);
	 }
	 }
	 return new NullProduct();
	 }
	 
	}
public class NullObjectPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop s1 = ProductFactory.getProduct("Tshirt");
		 Shop s2 = ProductFactory.getProduct("Trouser");
		 Shop s3 = ProductFactory.getProduct("Officebag");
		 Shop s4 = ProductFactory.getProduct("Shoes");
		 Shop s5 = ProductFactory.getProduct("Belt");
		 
		 s1.discountedProduct();
		 s2.discountedProduct();
		 s3.discountedProduct();
		 s4.discountedProduct();
		 s5.discountedProduct();

	}

}
