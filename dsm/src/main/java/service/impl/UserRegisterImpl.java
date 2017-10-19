package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IUserRegisterDao;
import dto.UserRegisterReq;
import dto.UserRegisterResp;
import service.IUserRegister;
import util.IUserUniqueKeyGenerator;
import vo.User;

@Service("userRegister")
public class UserRegisterImpl implements IUserRegister{

	@Autowired
	IUserRegisterDao userRegisterdao;
	
	@Autowired IUserUniqueKeyGenerator userUniqueKeyGenerator;

	public UserRegisterResp registerNewUser(UserRegisterReq req) {
		UserRegisterResp resp = new UserRegisterResp();
		String username = req.getUsername();

		if (userRegisterdao.queryByNewUserName(username) == null) {
			String userId = userUniqueKeyGenerator.UniqueKeyGenerator();
			userRegisterdao.addNewUser(req.getUsername(), req.getPassword(), req.getAge(), req.getCompany(),
					req.getTelephone(), req.getEmail(), userId);
			resp.setUserId(userId);
			resp.setRegisterDesc("注册成功！！");
		} else {
			resp.setRegisterDesc("注册失败！！用户名已重复！！");
		}
		return resp;
	}

}
