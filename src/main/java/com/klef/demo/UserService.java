package com.klef.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	 UserRepository userRepository;
	
	public User findUserByUserName(String username) {
		return userRepository.findByUsername(username);
	}
	
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	
}
