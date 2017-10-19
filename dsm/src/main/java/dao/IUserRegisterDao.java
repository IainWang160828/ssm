package dao;

import org.apache.ibatis.annotations.Param;

import vo.User;

public interface IUserRegisterDao {

	String queryByNewUserName(@Param("username")String username);
	
	void addNewUser(@Param("username")String username,@Param("password")String password,@Param("age")String age,@Param("company")String company,@Param("telephone")String telephone,@Param("email")String email,@Param("userId")String userId) throws RuntimeException;
}
