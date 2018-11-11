package com.dyy.service;

import java.util.List;

import com.dyy.pojo.User;

/**
 * 用户处理的的相关操作 service
 */
public interface UserService {

	/**
	 * 
	 * @Description: 新增用户
	 * @param user
	 * 
	 * @author leechenxiang
	 * @date 2017年8月17日 下午8:13:11
	 */
	public void saveUser(User user);
	
	/**
	 * @Description: 更新用户
	 * @param user
	 */
	public void updateUserById(User user);
	
	/**
	 * @Description: 删除用户
	 * @param userId
	 */
	public void deleteUserById(String userId);
	
	/**
	 * @Description: 根据用户主键ID获取用户信息
	 * @param userId
	 * @return
	 */
	public User getUserById(String userId);
	
	/**
	 * @Description: 获取用户列表
	 * @return
	 */
	public List<User> getUserList();
}
