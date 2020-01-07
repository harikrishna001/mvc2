package com.mvnrepo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvnrepo.dao.ILoginDao;
import com.mvnrepo.service.ILoginService;

@Service
public class LoginServiceImpl implements ILoginService {
	@Autowired
	private  ILoginDao   dao;

	public boolean verifyUser(String username, String password) {
		return dao.isUserExists(username, password);
	}
	
	    //boolean passwords,usernamea vumte true lakapothe false
	
}
