package dto;

public class UserRoleChangeResp {
	
	private String userId;
	private String userRole;
	private String roleChangeResult;
	private String roleChangeDesc;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getRoleChangeResult() {
		return roleChangeResult;
	}
	public void setRoleChangeResult(String roleChangeResult) {
		this.roleChangeResult = roleChangeResult;
	}
	public String getRoleChangeDesc() {
		return roleChangeDesc;
	}
	public void setRoleChangeDesc(String roleChangeDesc) {
		this.roleChangeDesc = roleChangeDesc;
	}
    
}
