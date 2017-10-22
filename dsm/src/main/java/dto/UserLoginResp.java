package dto;
/**
 * 用户登陆返回对象
 * @author Yi
 */


public class UserLoginResp {

	private String username;
	private String userRole;
	private String userRoleDesc;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserRoleDesc() {
		return userRoleDesc;
	}

	public void setUserRoleDesc(String userRoleDesc) {
		this.userRoleDesc = userRoleDesc;
	}
	
	

	
	
}
