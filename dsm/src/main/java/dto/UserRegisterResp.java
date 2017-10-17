package dto;
/**
 * 用户注册返回对象
 * @author Yi
 *
 */
public class UserRegisterResp {

	private String userId;
	private String registerDesc;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRegisterDesc() {
		return registerDesc;
	}

	public void setRegisterDesc(String registerDesc) {
		this.registerDesc = registerDesc;
	}
	
}
