package userenum;
public enum UserRoleEnum {

	USER_ROLE_A("1", "管理员"), USER_ROLE_N("2", "授权作者"), USER_ROLE_R("3", "读者");
	private String userLevel;
	private String userDesc;

	private UserRoleEnum(String userLevel, String userDesc) {
		this.userLevel = userLevel;
		this.userLevel = userLevel;
	}

	public String getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}

	public String getUserDesc() {
		return userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

}
