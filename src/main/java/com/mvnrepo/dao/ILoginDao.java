package com.mvnrepo.dao;

public interface ILoginDao {
	boolean  isUserExists(String username,String password);
	
}
