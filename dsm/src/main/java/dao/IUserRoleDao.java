package dao;

import org.apache.ibatis.annotations.Param;

import vo.UserRole;

public interface IUserRoleDao {
	
	UserRole queryUserRoleByUserId(@Param("userId")String userId);
	
	void addUserRole(@Param("userId")String userId,@Param("userRole")String userRole);
	
	
}
