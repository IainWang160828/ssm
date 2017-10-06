package service;

import dto.UserLoginReq;
import dto.UserLoginResp;
import vo.User;

public interface IUserService {

	 UserLoginResp loginByUsernameAndPassword(UserLoginReq req);
	
}
