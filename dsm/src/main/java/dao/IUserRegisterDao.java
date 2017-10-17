package dao;

import org.apache.ibatis.annotations.Param;

import vo.User;

public interface IUserRegisterDao {

	User queryByNewUserName(@Param("username")String username);
	
	void addNewUser(@Param("User")User userInfo) throws RuntimeException;
}
