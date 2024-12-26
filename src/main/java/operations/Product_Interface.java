package operations;

import java.util.ArrayList;
import java.util.List;

import model.Product_Pojo;

public interface Product_Interface {
	public abstract void addProduct(Product_Pojo pojo);
	public abstract void updateProduct(Product_Pojo pojo);
	public abstract void deleteProduct(Product_Pojo pojo);
	public abstract List<Product_Pojo> show();
	
	List<Product_Pojo> data = new ArrayList<Product_Pojo>();

}
