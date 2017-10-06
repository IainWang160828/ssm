package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IUserInfoDao;
import dto.UserLoginReq;
import dto.UserLoginResp;
import service.IUserService;
import vo.User;

@Service("userService")

public class UserServiceImpl implements IUserService{
	@Autowired
	IUserInfoDao userInfoDao;
	
	public UserLoginResp loginByUsernameAndPassword(UserLoginReq req) {
		UserLoginResp resp= new UserLoginResp();
		User loginResult= userInfoDao.queryByUserName(req.getUsername(), req.getPassword());
		if(loginResult!=null){
		resp.setUsername(loginResult.getUsername());
		}
	
		return resp;
	}

	

	
}
