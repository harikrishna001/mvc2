package com.mvnrepo.daoimpl;

import com.mvnrepo.dao.ILoginDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class LoginDaoImpl implements ILoginDao {   //e program content match
	@Autowired
	private  JdbcTemplate  jdbcTemplate;
	

	public boolean isUserExists(String username, String password) {
		int  i = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM user_tab WHERE user_name=? AND password=?", Integer.class,username,password);
		if(i==1) {
			return true;
		}else {
			return  false;
		}
	}

}
