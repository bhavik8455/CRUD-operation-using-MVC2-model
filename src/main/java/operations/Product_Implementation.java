package operations;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.Get_Connection;
import model.Product_Pojo;

public class Product_Implementation implements Product_Interface {

	@Override
	public void addProduct(Product_Pojo pojo) {
		
		PreparedStatement preparedStatement;
		try {
			preparedStatement = Get_Connection.getConnection().prepareStatement("insert into product values(?,?)");
			preparedStatement.setString(1, pojo.getPname());
			preparedStatement.setInt(2, pojo.getPprice());
			preparedStatement.executeUpdate();
			System.out.println("inserted successfully.........");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void updateProduct(Product_Pojo pojo) {
		try {
			PreparedStatement preparedStatement = Get_Connection.getConnection().prepareStatement("update product set pprice=? where pname=?");
			preparedStatement.setInt(1, pojo.getPprice());
			preparedStatement.setString(2, pojo.getPname());
			preparedStatement.executeUpdate();
			System.out.println("updated successfully.........");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteProduct(Product_Pojo pojo) {
		try {
			PreparedStatement preparedStatement = Get_Connection.getConnection().prepareStatement("delete from product where pname=?");
			preparedStatement.setString(1, pojo.getPname());
			preparedStatement.executeUpdate();
			System.out.println("deleted successfully.........");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public List<Product_Pojo> show() {
		List<Product_Pojo> data = new ArrayList<Product_Pojo>();
		try {
			PreparedStatement preparedStatement = Get_Connection.getConnection().prepareStatement("select * from product");
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Product_Pojo pojo = new Product_Pojo();
				pojo.setPname(resultSet.getString(1));
				pojo.setPprice(resultSet.getInt(2));
				data.add(pojo);
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return data;
	}
	

}
