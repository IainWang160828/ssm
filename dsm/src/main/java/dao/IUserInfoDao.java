package dao;

import org.apache.ibatis.annotations.Param;

import vo.User;

public interface IUserInfoDao {

	User queryByUserName(@Param("username")String username, @Param("password")String password);
	
	
	
	
}
