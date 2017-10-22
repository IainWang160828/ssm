package userenum;
public enum UserRoleEnum {

	USER_ROLE_A("A", "����Ա"), USER_ROLE_N("N", "��Ȩ����"), USER_ROLE_R("R", "����");
	private String userLevel;
	private String userDesc;

	private UserRoleEnum(String userLevel, String userDesc) {
		this.userLevel = userLevel;
		this.userDesc = userDesc;
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
