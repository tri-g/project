package com.example.minilogin.DAOimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.minilogin.DAO.ProductInfoDao;
import com.example.minilogin.model.ProductInfo;
import com.example.minilogin.model.Users;
import com.example.minilogin.util.DButil;
@RestController
public class ProductInfoDaoImpl implements ProductInfoDao{
	static List<ProductInfo> list1=new ArrayList();
	static List<ProductInfo> list2=new ArrayList();
	Connection connection;
	
	public ProductInfoDaoImpl() {
		connection = DButil.getConnection();
		System.out.println("connection" + connection);
	}	
	public List<ProductInfo> viewAllProducts(){
		//List<Customer> customer = new ArrayList<Customer>();		
		System.out.println("Inside viewAll Products");
		try {
			list1.clear();
			System.out.println("Inside try");
			PreparedStatement stmt = connection.prepareStatement("select * from product_info");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				
				ProductInfo prod=new ProductInfo();
				System.out.println("Inside while");
				prod.setProduct_id(rs.getString("product_id"));
				prod.setCategory_type(rs.getInt("category_type"));
				prod.setCreate_time(rs.getDate("create_time"));
				prod.setProduct_description(rs.getString("product_description"));

				prod.setProduct_icon(rs.getString("product_icon"));
				prod.setProduct_name(rs.getString("product_name"));
				prod.setProduct_price(rs.getFloat("product_price"));
				prod.setProduct_status(rs.getInt("product_status"));
				prod.setProduct_stock(rs.getInt("product_stock"));
				prod.setUpdate_time(rs.getDate("update_time"));

				


				System.out.println("Inside while-2");
				list1.add(prod);
				System.out.println(list1);
				
			}
			}catch(Exception e) {}
		return list1;
	}
	
	/*
	 * public List<ProductInfo> getProd(){ //List<Customer> customer = new
	 * ArrayList<Customer>(); System.out.println("Inside get Products"); try {
	 * list2.clear();
	 * 
	 * System.out.println("Inside tryhkjhkj"); PreparedStatement stmt =
	 * connection.prepareStatement("select product_id  from product_info");
	 * ResultSet rs = stmt.executeQuery(); while (rs.next()) {
	 * 
	 * ProductInfo prod=new ProductInfo();
	 * System.out.println("Inside whilhjhkjkjhe");
	 * prod.setProduct_id(rs.getString("product_id"));
	 * 
	 * 
	 * 
	 * System.out.println("Inside while-2kutfjj"); list2.add(prod);
	 * System.out.println(list2);
	 * 
	 * } }catch(Exception e) {} return list2; }
	 * 
	 * 
	 */
	public List<ProductInfo> viewAllProducts1(String id){
		//List<Customer> customer = new ArrayList<Customer>();		
		System.out.println("Inside viewAll Products");
		try {
			list2.clear();
			System.out.println("Inside try");
			PreparedStatement stmt = connection.prepareStatement("select * from product_info where product_id='" + id + "'");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				ProductInfo prod=new ProductInfo();
				System.out.println("first");
				prod.setProduct_id(rs.getString("product_id"));
				prod.setCategory_type(rs.getInt("category_type"));
				prod.setCreate_time(rs.getDate("create_time"));
				prod.setProduct_description(rs.getString("product_description"));

				prod.setProduct_icon(rs.getString("product_icon"));
				prod.setProduct_name(rs.getString("product_name"));
				prod.setProduct_price(rs.getFloat("product_price"));
				prod.setProduct_status(rs.getInt("product_status"));
				prod.setProduct_stock(rs.getInt("product_stock"));
				prod.setUpdate_time(rs.getDate("update_time"));
				
				System.out.println("second");
				list2.add(prod);
				System.out.println(list2);	
			}
			}catch(Exception e) {}
		return list2;
	}

}
