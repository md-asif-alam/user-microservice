package com.codewithasif.user.service.services;

import java.util.List;

import com.codewithasif.user.service.entities.User;

public interface UserService {

	//user operations

	//create user
	User saveUser(User user);

	//get all user
	List<User> getAllUser();

	//get single user of given userId
	User getUser(String userId);

}
