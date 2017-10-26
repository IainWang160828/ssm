package service.impl;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IUserInfoDao;
import dto.UserLoginReq;
import dto.UserLoginResp;
import dto.UserRegisterReq;
import dto.UserRegisterResp;
import dto.UserRoleResp;
import service.IUserRoleService;
import service.IUserService;
import vo.User;

@Service("userService")

public class UserServiceImpl implements IUserService{
	@Autowired
	IUserInfoDao userInfoDao;
	
	@Autowired
	IUserRoleService userRoleService;
	
	public UserLoginResp loginByUsernameAndPassword(UserLoginReq req) {
		UserLoginResp resp= new UserLoginResp();
		UserRoleResp userRoleResp= new UserRoleResp();
		User loginResult= userInfoDao.queryByUserName(req.getUsername(), req.getPassword());
		ArrayList<User> queryResult= userInfoDao.queryAllUserInfo();
		if(loginResult.getUserId()!=null){
		userRoleResp=userRoleService.queryUserRoleByUserId(loginResult.getUserId());
		if(userRoleResp.getStatus().equals("0000")){
		resp.setUsername(loginResult.getUsername());
		resp.setUserRole(loginResult.getUserRole());
		resp.setUserRoleDesc(userRoleResp.getUserRoleDesc());
		resp.setUserList(queryResult);
		}
		}
	
		return resp;
	}

	
}
