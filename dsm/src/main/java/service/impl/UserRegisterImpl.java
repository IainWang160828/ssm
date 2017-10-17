package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IUserRegisterDao;
import dto.UserRegisterReq;
import dto.UserRegisterResp;
import service.IUserRegister;
import vo.User;

@Service("userRegister")
public class UserRegisterImpl implements IUserRegister{

	@Autowired
	IUserRegisterDao userRegisterdao;
	public UserRegisterResp registerNewUser(UserRegisterReq req) {
		UserRegisterResp resp =new UserRegisterResp();
		String username=req.getUsername();
		if(userRegisterdao.queryByNewUserName(username)==null){
			User userInfo= new User();
			userInfo.setUsername(req.getUsername());
			userInfo.setPassword(req.getPassword());
			userInfo.setAge(req.getAge());
			userInfo.setCompany(req.getCompany());
			userInfo.setEmail(req.getEmail());
			userInfo.setUserId("1122314");//暂时先写死
			userInfo.setTelephone(req.getUsername());
			userRegisterdao.addNewUser(userInfo);
			resp.setUserId(userInfo.getUserId());
			resp.setRegisterDesc("注册成功！！");
		}
		else{
			resp.setRegisterDesc("注册失败！！用户名已重复！！");
		}
		return resp;
	}

}
