package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IUserRoleChangeDao;
import dto.UserRoleChangeReq;
import dto.UserRoleChangeResp;
import dto.UserRoleResp;
import service.IUserRoleChangeService;
import service.IUserRoleService;

/**
 * ��ɫȨ���޸ķ����࣬�ݶ�Ϊʵʱ�޸�
 * 
 * @author Yi
 *
 */
@Service
public class UserRoleChangeServiceImpl implements IUserRoleChangeService {

	@Autowired
	IUserRoleChangeDao userRoleChangeDao;
	@Autowired
	IUserRoleService userRoleService;

	public UserRoleChangeResp changeUserRoleService(UserRoleChangeReq req) {
		UserRoleChangeResp resp = new UserRoleChangeResp();
		userRoleChangeDao.updateUserRole(req.getUserId(), req.getUserRole());
		UserRoleResp currentUserRole = userRoleService.queryUserRoleByUserId(req.getUserId());
		if (currentUserRole.getUserRole().equals(req.getUserRole())) {
			resp.setUserId(req.getUserId());
			resp.setUserRole(currentUserRole.getUserRole());
			resp.setRoleChangeResult("1");
			resp.setRoleChangeDesc("��ɫȨ���޸ĳɹ�����");
			return resp;
		} else {
			resp.setUserId(req.getUserId());
			resp.setUserRole(req.getUserRole());
			resp.setRoleChangeResult("0");
			resp.setRoleChangeDesc("�޸�ʧ�ܣ���");
			return resp;
		}
	}

}
