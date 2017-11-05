package dao;

import org.apache.ibatis.annotations.Param;

public interface IUserRoleChangeDao {
	
	void updateUserRole(@Param("userId") String userId,@Param("userRole") String userRole);

}
