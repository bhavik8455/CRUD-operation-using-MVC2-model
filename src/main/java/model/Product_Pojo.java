package model;

import java.util.List;

import operations.Product_Implementation;

public class Product_Pojo {
	
	String pname;
	int pprice;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	
	
	public void addProduct(Product_Pojo pojo) {
		new Product_Implementation().addProduct(pojo);
	}
	
	public void updateProduct(Product_Pojo pojo) {
		new Product_Implementation().updateProduct(pojo);
	}
	
	public void deleteProduct(Product_Pojo pojo) {
		new Product_Implementation().deleteProduct(pojo);
	}
	
	public List<Product_Pojo> show(){
		return  new Product_Implementation().show();
	}

}
