package service;

import dto.UserRoleChangeReq;
import dto.UserRoleChangeResp;

public interface IUserRoleChangeService {

	UserRoleChangeResp changeUserRoleService(UserRoleChangeReq req);
}
