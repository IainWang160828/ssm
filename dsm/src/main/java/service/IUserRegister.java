package service;

import dto.UserRegisterReq;
import dto.UserRegisterResp;

public interface IUserRegister {

	 UserRegisterResp registerNewUser(UserRegisterReq req);
}
