package service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IUserRoleDao;
import dto.UserRoleReq;
import dto.UserRoleResp;
import service.IUserRoleService;
import userenum.UserRoleEnum;
import vo.UserRole;

@Service
public class UserRoleImpl implements IUserRoleService{
@Autowired
IUserRoleDao userRoleDao;
	public UserRoleResp queryUserRoleByUserId(String userId) {
		
		UserRoleResp resp= new UserRoleResp();
		UserRole userRole= new UserRole();
		userRole= userRoleDao.queryUserRoleByUserId(userId);
		if(userRole.getUserRole()!=null&&userRole.getUserRole().equals(UserRoleEnum.USER_ROLE_A.getUserLevel())){
		resp.setUserRole(UserRoleEnum.USER_ROLE_A.getUserLevel());
		resp.setUserRoleDesc(UserRoleEnum.USER_ROLE_A.getUserDesc());
		resp.setStatus("0000");
		}
		else if(userRole.getUserRole()!=null&&userRole.getUserRole().equals(UserRoleEnum.USER_ROLE_N.getUserLevel())){
	    resp.setUserRole(UserRoleEnum.USER_ROLE_N.getUserLevel());
	    resp.setUserRoleDesc(UserRoleEnum.USER_ROLE_N.getUserDesc());
	    resp.setStatus("0000");
		}
		else if(userRole.getUserRole()!=null&&userRole.getUserRole().equals(UserRoleEnum.USER_ROLE_R.getUserLevel())){
	    resp.setUserRole(UserRoleEnum.USER_ROLE_R.getUserLevel());
	    resp.setUserRoleDesc(UserRoleEnum.USER_ROLE_R.getUserDesc());
	    resp.setStatus("0000");
		}
		else{
		resp.setStatus("9999");
		}
		
		return resp;
	}

	public void addUserRoleByUserId(UserRoleReq req) {
		UserRoleResp resp= new UserRoleResp();
		userRoleDao.addUserRole(req.getUserId(), req.getUserRole());
		final Logger logger = LoggerFactory.getLogger("addUserRoleByUserId");
		logger.info("============>插入用户角色成功"+req.getUserId());
		resp.setStatus("0000");
	}

	

}
