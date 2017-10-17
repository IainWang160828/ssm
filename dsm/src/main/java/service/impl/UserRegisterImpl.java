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
			userInfo.setUserId("1122314");//��ʱ��д��
			userInfo.setTelephone(req.getUsername());
			userRegisterdao.addNewUser(userInfo);
			resp.setUserId(userInfo.getUserId());
			resp.setRegisterDesc("ע��ɹ�����");
		}
		else{
			resp.setRegisterDesc("ע��ʧ�ܣ����û������ظ�����");
		}
		return resp;
	}

}
