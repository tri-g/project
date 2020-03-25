package com.example.minilogin.DAO;

import java.util.List;

import com.example.minilogin.model.Users;

public interface CartDAO {
	public List<Users> viewAllName();
	public int idvalidation(String name,String id1);
	public List<Users> orders();
}