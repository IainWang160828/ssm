package service;

import dto.UserRoleReq;
import dto.UserRoleResp;

public interface IUserRoleService {
	
	UserRoleResp queryUserRoleByUserId(String userId);
	
	void addUserRoleByUserId(String userId, String userRole);

}
