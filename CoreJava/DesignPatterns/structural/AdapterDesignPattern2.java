package Design_pattern.structural;

import java.util.ArrayList;
import java.util.List;

interface Product {
	  
    String getName();
    double getPrice(); 
}

class ShopInventory {
  
    private List<Product> products;
  
    public ShopInventory() {
        this.products = new ArrayList<>();
    }
  
    public void addProduct(Product product) {
        this.products.add(product);
    }
  
    public void removeProduct(Product product) {
        this.products.remove(product);
    }
}
// Another shop--Starts selling grocery
class GroceryItem {
	  
    String itemName;
    int costPerUnit;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(int costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	public GroceryItem(String itemName, int costPerUnit) {
		super();
		this.itemName = itemName;
		this.costPerUnit = costPerUnit;
	}
  
   //constructor, getters and setters
    
}
class GroceryItemAdapter implements Product {
  
    private GroceryItem groceryItem;
  
    public GroceryItemAdapter(GroceryItem groceryItem) {
        this.groceryItem = groceryItem;
    }
  
    public String getName() {
        return groceryItem.getItemName();
    }
  
    public double getPrice() {
        return groceryItem.getCostPerUnit();    
    }
}

//Cosmetic Item
class CosmeticItem {
	  
    String itemName;
    int costPerUnit;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(int costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	public CosmeticItem(String itemName, int costPerUnit) {
		super();
		this.itemName = itemName;
		this.costPerUnit = costPerUnit;
	}
  
   //constructor, getters and setters
    
}
class CosmeticItemAdapter implements Product {
  
    private CosmeticItem CosmeticItem;
  
    public CosmeticItemAdapter(CosmeticItem CosmeticItem) {
        this.CosmeticItem = CosmeticItem;
    }
  
    public String getName() {
        return CosmeticItem.getItemName();
    }
  
    public double getPrice() {
        return CosmeticItem.getCostPerUnit();    
    }
}

public class AdapterDesignPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShopInventory inventory = new ShopInventory();
		  
		//adding regular store products - ones that implement Product interface
		inventory.addProduct(new CosmeticItemAdapter(new CosmeticItem("Lavie Handbag", 500)));
		
		  
		  
		//adding GroceryItem to the store using an adapter
		GroceryItem groceryItem = new GroceryItem("Wheat Flour", 100);
		inventory.addProduct(new GroceryItemAdapter(groceryItem));


	}

}
