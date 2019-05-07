package com.hcl.IngTradingApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.IngTradingApp.dto.UserDto;
import com.hcl.IngTradingApp.entity.User;
import com.hcl.IngTradingApp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	@Override
	public List<UserDto> getUsersList() {
		List<UserDto> response = new ArrayList<UserDto>();
		try {
			List<User> usersList = userRepository.findAll();
			if (!usersList.isEmpty()) {
				usersList.stream().forEach(userEntity -> {
					UserDto user = new UserDto();
					user.setUserId(userEntity.getUserId());;
					user.setUserName(userEntity.getUserName());
					
					response.add(user);
				});
			}

		} catch (Exception e) {

		}
		return response;
	}

}
