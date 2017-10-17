package service;

import dto.UserLoginReq;
import dto.UserLoginResp;
import dto.UserRegisterReq;
import dto.UserRegisterResp;
import vo.User;

public interface IUserService {

	 UserLoginResp loginByUsernameAndPassword(UserLoginReq req);
	 
	
	
}
