package dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import vo.User;

@Transactional
public interface IUserRegisterDao {

	String queryByNewUserName(@Param("username")String username);
	
	void addNewUser(@Param("username")String username,@Param("password")String password,@Param("age")String age,@Param("company")String company,@Param("telephone")String telephone,@Param("email")String email,@Param("userId")String userId) throws RuntimeException;
}
