package dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import vo.User;
import vo.UserRole;

public interface IUserInfoDao {

	User queryByUserName(@Param("username")String username, @Param("password")String password);
	
	
	ArrayList<User> queryAllUserInfo();
	
}
