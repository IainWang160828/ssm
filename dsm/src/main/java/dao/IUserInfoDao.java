package dao;

import vo.User;

public interface IUserInfoDao {

	User queryByUserName(String username, String password); 
}
