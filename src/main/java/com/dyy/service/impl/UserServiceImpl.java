package com.dyy.service.impl;

import java.util.List;

import com.dyy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dyy.mapper.UserMapper;
import com.dyy.pojo.User;
import com.dyy.pojo.UserExample;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void saveUser(User user) {
		userMapper.insert(user);
	}

	@Override
	public void updateUserById(User user) {
		userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public void deleteUserById(String userId) {
		userMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public User getUserById(String userId) {
		
		return userMapper.selectByPrimaryKey(userId);
	}
	
	@Override
	public List<User> getUserList() {
		
		UserExample ue = new UserExample();
		List<User> userList = userMapper.selectByExample(ue);
		
		return userList;
	}

}
