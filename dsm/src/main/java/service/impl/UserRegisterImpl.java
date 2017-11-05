package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import dao.IUserRegisterDao;
import dto.UserRegisterReq;
import dto.UserRegisterResp;
import service.IUserRegister;
import service.IUserRoleService;
import util.IUserUniqueKeyGenerator;
import vo.User;

@Service("userRegister")
public class UserRegisterImpl implements IUserRegister{

	@Autowired
	IUserRegisterDao userRegisterdao;
	
	@Autowired 
	IUserUniqueKeyGenerator userUniqueKeyGenerator;
	
	@Autowired
    IUserRoleService userRoleService;
	

    @Transactional
	public UserRegisterResp registerNewUser(UserRegisterReq req) {
		UserRegisterResp resp = new UserRegisterResp();
		String username = req.getUsername();

		if (userRegisterdao.queryByNewUserName(username) == null) {
			String userId = userUniqueKeyGenerator.UniqueKeyGenerator();
			userRegisterdao.addNewUser(req.getUsername(), req.getPassword(), req.getAge(), req.getCompany(),
					req.getTelephone(), req.getEmail(), userId);
			userRoleService.addUserRoleByUserId(userId,"R");//ע��ʱĬ�����Ȩ��
			resp.setUserId(userId);
			resp.setRegisterDesc("ע��ɹ�����");
		} else {
			resp.setRegisterDesc("ע��ʧ�ܣ����û������ظ�����");
		}
		return resp;
	}

}
